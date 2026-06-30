package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class StatisticsFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.StatisticsFileSystem> CREATOR = new com.tencent.mm.vfs.y5();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212753e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1[] f212754f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1[] f212755g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f212756h;

    public StatisticsFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, boolean z17) {
        this.f212753e = fileSystem;
        this.f212754f = null;
        this.f212755g = null;
        this.f212756h = z17;
    }

    public static int c(java.lang.String str) {
        int i17 = 1;
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.isEmpty()) {
            return 0;
        }
        int length = str.length();
        for (int i18 = 0; i18 < length; i18++) {
            if (str.charAt(i18) == '/') {
                i17++;
            }
        }
        return i17;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        java.util.Collection collection;
        java.util.TreeSet treeSet;
        com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) this.f212753e.b(map);
        if (q2Var == com.tencent.mm.vfs.NullFileSystem.f()) {
            return q2Var;
        }
        com.tencent.mm.vfs.f1[] f1VarArr = this.f212754f;
        if (f1VarArr == null) {
            collection = java.util.Collections.singletonList("");
        } else {
            java.util.TreeSet treeSet2 = new java.util.TreeSet();
            for (com.tencent.mm.vfs.f1 f1Var : f1VarArr) {
                java.lang.String[] b17 = f1Var.b(map);
                if (b17 != null) {
                    for (java.lang.String str : b17) {
                        boolean z17 = !str.endsWith("\u0000");
                        if (!z17) {
                            str = str.substring(0, str.length() - 1);
                        }
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, true);
                        if (!z17) {
                            l17 = l17 + (char) 0;
                        }
                        treeSet2.add(l17);
                    }
                }
            }
            collection = treeSet2;
        }
        com.tencent.mm.vfs.f1[] f1VarArr2 = this.f212755g;
        if (f1VarArr2 == null) {
            treeSet = null;
        } else {
            treeSet = new java.util.TreeSet();
            for (com.tencent.mm.vfs.f1 f1Var2 : f1VarArr2) {
                java.lang.String[] b18 = f1Var2.b(map);
                if (b18 != null) {
                    for (java.lang.String str2 : b18) {
                        treeSet.add(com.tencent.mm.vfs.e8.l(str2, true, true));
                    }
                }
            }
            java.util.Iterator it = treeSet.iterator();
            java.lang.String str3 = null;
            while (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                if (str3 != null && str4.startsWith(str3) && str4.charAt(str3.length()) == '/') {
                    it.remove();
                } else {
                    str3 = str4;
                }
            }
        }
        return new com.tencent.mm.vfs.a6(this, q2Var, (java.lang.String[]) collection.toArray(new java.lang.String[0]), treeSet != null ? (java.lang.String[]) treeSet.toArray(new java.lang.String[0]) : null, map);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.StatisticsFileSystem)) {
            return false;
        }
        com.tencent.mm.vfs.StatisticsFileSystem statisticsFileSystem = (com.tencent.mm.vfs.StatisticsFileSystem) obj;
        return this.f212753e.equals(statisticsFileSystem.f212753e) && this.f212756h == statisticsFileSystem.f212756h && java.util.Arrays.equals(this.f212754f, statisticsFileSystem.f212754f) && java.util.Arrays.equals(this.f212755g, statisticsFileSystem.f212755g);
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.StatisticsFileSystem.class.hashCode();
        java.lang.Object[] objArr = {this.f212753e, this.f212754f, this.f212755g, java.lang.Boolean.valueOf(this.f212756h)};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    public java.lang.String toString() {
        return "stat <- " + this.f212753e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.StatisticsFileSystem.class, 2);
        parcel.writeParcelable(this.f212753e, i17);
        com.tencent.mm.vfs.f1[] f1VarArr = this.f212754f;
        if (f1VarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(f1VarArr.length);
            for (com.tencent.mm.vfs.f1 f1Var : f1VarArr) {
                parcel.writeString(f1Var.f212921a);
            }
        }
        com.tencent.mm.vfs.f1[] f1VarArr2 = this.f212755g;
        if (f1VarArr2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(f1VarArr2.length);
            for (com.tencent.mm.vfs.f1 f1Var2 : f1VarArr2) {
                parcel.writeString(f1Var2.f212921a);
            }
        }
        parcel.writeByte(this.f212756h ? (byte) 1 : (byte) 0);
    }

    public StatisticsFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, boolean z17, java.util.Collection collection, java.util.Collection collection2) {
        this.f212753e = fileSystem;
        this.f212756h = z17;
        int i17 = 0;
        if (collection != null && !collection.isEmpty()) {
            this.f212754f = new com.tencent.mm.vfs.f1[collection.size()];
            java.util.Iterator it = collection.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                this.f212754f[i18] = new com.tencent.mm.vfs.f1((java.lang.String) it.next());
                i18++;
            }
        } else {
            this.f212754f = null;
        }
        if (collection2 == null) {
            this.f212755g = null;
            return;
        }
        this.f212755g = new com.tencent.mm.vfs.f1[collection2.size()];
        java.util.Iterator it6 = collection2.iterator();
        while (it6.hasNext()) {
            this.f212755g[i17] = new com.tencent.mm.vfs.f1((java.lang.String) it6.next());
            i17++;
        }
    }

    public StatisticsFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.StatisticsFileSystem.class, 2);
        com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212753e = fileSystem;
        if (fileSystem != null) {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                this.f212754f = null;
            } else {
                this.f212754f = new com.tencent.mm.vfs.f1[readInt];
                for (int i17 = 0; i17 < readInt; i17++) {
                    this.f212754f[i17] = new com.tencent.mm.vfs.f1(parcel.readString());
                }
            }
            int readInt2 = parcel.readInt();
            if (readInt2 == 0) {
                this.f212755g = null;
            } else {
                this.f212755g = new com.tencent.mm.vfs.f1[readInt2];
                for (int i18 = 0; i18 < readInt2; i18++) {
                    this.f212755g[i18] = new com.tencent.mm.vfs.f1(parcel.readString());
                }
            }
            this.f212756h = parcel.readByte() != 0;
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}

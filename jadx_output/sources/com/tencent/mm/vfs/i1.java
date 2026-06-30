package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.a0[] f212990a;

    public i1(com.tencent.mm.vfs.a0... a0VarArr) {
        com.tencent.mm.vfs.a0[] a0VarArr2 = new com.tencent.mm.vfs.a0[a0VarArr.length];
        this.f212990a = a0VarArr2;
        java.lang.System.arraycopy(a0VarArr, 0, a0VarArr2, 0, a0VarArr.length);
        for (com.tencent.mm.vfs.a0 a0Var : a0VarArr2) {
            if (!(a0Var instanceof com.tencent.mm.vfs.FileSystem) && !(a0Var instanceof com.tencent.mm.vfs.h1)) {
                throw new java.lang.IllegalArgumentException("Invalid type of FileSystem: " + a0Var.getClass());
            }
        }
    }

    public java.util.List a(java.util.Map map) {
        com.tencent.mm.vfs.a0[] a0VarArr = this.f212990a;
        java.util.ArrayList arrayList = new java.util.ArrayList(a0VarArr.length);
        for (com.tencent.mm.vfs.a0 a0Var : a0VarArr) {
            if (a0Var instanceof com.tencent.mm.vfs.FileSystem) {
                com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) ((com.tencent.mm.vfs.FileSystem) a0Var).b(map);
                if (q2Var != com.tencent.mm.vfs.NullFileSystem.f()) {
                    arrayList.add(q2Var);
                }
            } else if (a0Var instanceof com.tencent.mm.vfs.h1) {
                java.util.Iterator it = ((com.tencent.mm.vfs.h1) a0Var).b(map).iterator();
                while (it.hasNext()) {
                    arrayList.add((com.tencent.mm.vfs.q2) it.next());
                }
            }
        }
        return arrayList;
    }

    public void b(android.os.Parcel parcel) {
        com.tencent.mm.vfs.a0[] a0VarArr = this.f212990a;
        parcel.writeInt(a0VarArr.length);
        for (com.tencent.mm.vfs.a0 a0Var : a0VarArr) {
            if (a0Var instanceof com.tencent.mm.vfs.FileSystem) {
                parcel.writeByte((byte) 0);
                parcel.writeParcelable((com.tencent.mm.vfs.FileSystem) a0Var, 0);
            } else if (a0Var instanceof com.tencent.mm.vfs.h1) {
                parcel.writeByte((byte) 1);
                ((com.tencent.mm.vfs.h1) a0Var).d(parcel);
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.i1) {
            if (java.util.Arrays.equals(this.f212990a, ((com.tencent.mm.vfs.i1) obj).f212990a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.tencent.mm.vfs.i1.class.hashCode() ^ java.util.Arrays.hashCode(this.f212990a);
    }

    public java.lang.String toString() {
        return java.util.Arrays.toString(this.f212990a);
    }

    public i1(java.util.Collection collection) {
        com.tencent.mm.vfs.a0[] a0VarArr = (com.tencent.mm.vfs.a0[]) collection.toArray(new com.tencent.mm.vfs.a0[0]);
        this.f212990a = a0VarArr;
        for (com.tencent.mm.vfs.a0 a0Var : a0VarArr) {
            if (!(a0Var instanceof com.tencent.mm.vfs.FileSystem) && !(a0Var instanceof com.tencent.mm.vfs.h1)) {
                throw new java.lang.IllegalArgumentException("Invalid type of FileSystem: " + a0Var.getClass());
            }
        }
    }

    public i1(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        this.f212990a = new com.tencent.mm.vfs.a0[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            byte readByte = parcel.readByte();
            if (readByte == 0) {
                this.f212990a[i17] = (com.tencent.mm.vfs.a0) parcel.readParcelable(com.tencent.mm.vfs.i1.class.getClassLoader());
            } else if (readByte == 1) {
                this.f212990a[i17] = new com.tencent.mm.vfs.h1(parcel);
            }
        }
    }
}

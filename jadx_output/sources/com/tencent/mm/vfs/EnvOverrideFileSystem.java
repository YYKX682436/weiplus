package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class EnvOverrideFileSystem implements com.tencent.mm.vfs.FileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.EnvOverrideFileSystem> CREATOR = new com.tencent.mm.vfs.j1();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212706d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f212707e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f212708f;

    public EnvOverrideFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, java.util.Map map) {
        this.f212706d = fileSystem;
        this.f212707e = null;
        this.f212708f = com.tencent.mm.vfs.l1.a(map);
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        com.tencent.mm.vfs.FileSystem fileSystem = this.f212706d;
        if (fileSystem == null) {
            fileSystem = (com.tencent.mm.vfs.FileSystem) ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).c().get(this.f212707e);
        }
        if (fileSystem == null) {
            return com.tencent.mm.vfs.NullFileSystem.f();
        }
        java.util.HashMap hashMap = new java.util.HashMap(map);
        com.tencent.mm.vfs.o5.c(hashMap, this.f212708f);
        return (com.tencent.mm.vfs.q2) fileSystem.b(hashMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.tencent.mm.vfs.EnvOverrideFileSystem
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.tencent.mm.vfs.EnvOverrideFileSystem r10 = (com.tencent.mm.vfs.EnvOverrideFileSystem) r10
            com.tencent.mm.vfs.FileSystem r0 = r10.f212706d
            com.tencent.mm.vfs.FileSystem r2 = r9.f212706d
            boolean r0 = com.tencent.mm.vfs.e8.f(r2, r0)
            if (r0 == 0) goto Lab
            java.lang.String r0 = r9.f212707e
            java.lang.String r2 = r10.f212707e
            boolean r0 = com.tencent.mm.vfs.e8.f(r0, r2)
            if (r0 == 0) goto Lab
            java.util.Map r0 = r9.f212708f
            java.util.Map r10 = r10.f212708f
            r2 = 1
            if (r0 != r10) goto L26
        L23:
            r10 = r2
            goto La8
        L26:
            if (r0 == 0) goto La7
            if (r10 != 0) goto L2c
            goto La7
        L2c:
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r3 = r0.size()
            java.util.HashMap r10 = (java.util.HashMap) r10
            int r4 = r10.size()
            if (r3 == r4) goto L3c
            goto La7
        L3c:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r5 = r10.get(r4)
            if (r3 != 0) goto L67
            boolean r4 = r10.containsKey(r4)
            if (r4 != 0) goto L67
            goto La7
        L67:
            if (r3 != r5) goto L6b
            r3 = r2
            goto La5
        L6b:
            boolean r4 = r3 instanceof java.lang.String[]
            r6 = 0
            if (r4 == 0) goto L7e
            r4 = r3
            java.lang.String[] r4 = (java.lang.String[]) r4
            int r7 = r4.length
            if (r7 == 0) goto L7d
            if (r7 == r2) goto L7a
            r4 = r2
            goto L7f
        L7a:
            r3 = r4[r1]
            goto L7e
        L7d:
            r3 = r6
        L7e:
            r4 = r1
        L7f:
            boolean r7 = r5 instanceof java.lang.String[]
            if (r7 == 0) goto L91
            r7 = r5
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r8 = r7.length
            if (r8 == 0) goto L90
            if (r8 == r2) goto L8d
            r6 = r2
            goto L92
        L8d:
            r5 = r7[r1]
            goto L91
        L90:
            r5 = r6
        L91:
            r6 = r1
        L92:
            if (r4 == r6) goto L96
            r3 = r1
            goto La5
        L96:
            if (r4 == 0) goto La1
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.String[] r5 = (java.lang.String[]) r5
            boolean r3 = java.util.Arrays.equals(r3, r5)
            goto La5
        La1:
            boolean r3 = com.tencent.mm.vfs.e8.f(r3, r5)
        La5:
            if (r3 != 0) goto L44
        La7:
            r10 = r1
        La8:
            if (r10 == 0) goto Lab
            r1 = r2
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.EnvOverrideFileSystem.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i17;
        java.lang.Object[] objArr = {this.f212706d, this.f212707e};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        int deepHashCode = java.util.Arrays.deepHashCode(objArr);
        int i18 = 0;
        for (java.util.Map.Entry entry : this.f212708f.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Object value = entry.getValue();
            if (value != null) {
                if (value instanceof java.lang.String[]) {
                    java.lang.Object[] objArr2 = (java.lang.String[]) value;
                    if (objArr2.length != 0) {
                        if (objArr2.length == 1) {
                            value = objArr2[0];
                        } else {
                            i17 = java.util.Arrays.hashCode(objArr2);
                            i18 += i17 ^ hashCode;
                        }
                    }
                }
                i17 = value.hashCode();
                i18 += i17 ^ hashCode;
            }
            i17 = 0;
            i18 += i17 ^ hashCode;
        }
        return deepHashCode ^ i18;
    }

    public java.lang.String toString() {
        java.lang.String sb6;
        java.lang.String str;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("env");
        java.util.Map map = this.f212708f;
        if (map.isEmpty()) {
            sb6 = "{}";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append('{');
            for (java.util.Map.Entry entry : map.entrySet()) {
                sb8.append((java.lang.String) entry.getKey());
                sb8.append(": ");
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof java.lang.String[]) {
                        java.lang.String[] strArr = (java.lang.String[]) value;
                        int length = strArr.length;
                        if (length != 0) {
                            str = length != 1 ? java.util.Arrays.toString(strArr) : strArr[0];
                        }
                    } else {
                        str = value.toString();
                    }
                    sb8.append(str);
                    sb8.append("; ");
                }
                str = "(deleted)";
                sb8.append(str);
                sb8.append("; ");
            }
            sb8.setLength(sb8.length() - 2);
            sb8.append('}');
            sb6 = sb8.toString();
        }
        sb7.append(sb6);
        sb7.append(" <- ");
        com.tencent.mm.vfs.FileSystem fileSystem = this.f212706d;
        sb7.append(fileSystem == null ? "\"" + this.f212707e + "\"" : fileSystem.toString());
        return sb7.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.EnvOverrideFileSystem.class, 1);
        parcel.writeParcelable(this.f212706d, i17);
        parcel.writeString(this.f212707e);
        java.util.Map map = this.f212708f;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            parcel.writeString(str);
            if (value instanceof java.lang.String[]) {
                java.lang.String[] strArr = (java.lang.String[]) value;
                if (strArr.length > 0) {
                    parcel.writeStringArray(strArr);
                }
            }
            if (value instanceof java.lang.String) {
                parcel.writeStringArray(new java.lang.String[]{(java.lang.String) value});
            } else {
                parcel.writeStringArray(null);
            }
        }
    }

    public EnvOverrideFileSystem(java.lang.String str, java.util.Map map) {
        this.f212706d = null;
        this.f212707e = str;
        this.f212708f = com.tencent.mm.vfs.l1.a(map);
    }

    public EnvOverrideFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.EnvOverrideFileSystem.class, 1);
        com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212706d = fileSystem;
        java.lang.String readString = parcel.readString();
        this.f212707e = readString;
        if ((fileSystem == null) != (readString == null)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            int readInt = parcel.readInt();
            while (true) {
                int i17 = readInt - 1;
                if (readInt > 0) {
                    java.lang.String readString2 = parcel.readString();
                    java.lang.String[] createStringArray = parcel.createStringArray();
                    if (createStringArray != null && createStringArray.length != 0) {
                        if (createStringArray.length == 1) {
                            hashMap.put(readString2, createStringArray[0]);
                        } else {
                            hashMap.put(readString2, createStringArray);
                        }
                    } else {
                        hashMap.put(readString2, null);
                    }
                    readInt = i17;
                } else {
                    this.f212708f = hashMap;
                    return;
                }
            }
        } else {
            throw new java.lang.IllegalArgumentException();
        }
    }
}

package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class h1 implements com.tencent.mm.vfs.a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f212965i = java.util.regex.Pattern.compile("[A-Za-z0-9_]+");

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f212966d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212967e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f212968f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f212969g;

    /* renamed from: h, reason: collision with root package name */
    public char f212970h;

    public h1(com.tencent.mm.vfs.FileSystem fileSystem, java.lang.String str, java.lang.String str2) {
        this.f212966d = fileSystem;
        this.f212967e = new com.tencent.mm.vfs.f1(str);
        this.f212968f = str2;
        c();
    }

    @Override // com.tencent.mm.vfs.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Iterable b(java.util.Map map) {
        java.lang.String[] b17 = this.f212967e.b(map);
        return b17 == null ? java.util.Collections.emptyList() : new pm5.b(java.util.Arrays.asList(b17), new com.tencent.mm.vfs.g1(this, map));
    }

    public final void c() {
        java.util.regex.Pattern pattern = f212965i;
        java.lang.String str = this.f212968f;
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            throw new java.lang.IllegalArgumentException("No output variable recognized: " + str);
        }
        int end = matcher.end();
        if (end == str.length()) {
            this.f212969g = null;
            return;
        }
        this.f212970h = str.charAt(end);
        this.f212969g = new java.util.ArrayList();
        do {
            this.f212969g.add(matcher.group());
        } while (matcher.find());
    }

    public void d(android.os.Parcel parcel) {
        parcel.writeString(this.f212967e.f212921a);
        parcel.writeString(this.f212968f);
        java.lang.Object obj = this.f212966d;
        if (obj instanceof com.tencent.mm.vfs.FileSystem) {
            parcel.writeByte((byte) 0);
            parcel.writeParcelable((com.tencent.mm.vfs.FileSystem) obj, 0);
        } else {
            parcel.writeByte((byte) 1);
            ((com.tencent.mm.vfs.h1) obj).d(parcel);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.h1)) {
            return false;
        }
        com.tencent.mm.vfs.h1 h1Var = (com.tencent.mm.vfs.h1) obj;
        return this.f212966d.equals(h1Var.f212966d) && this.f212967e.equals(h1Var.f212967e) && this.f212968f.equals(h1Var.f212968f);
    }

    public int hashCode() {
        java.lang.Object[] objArr = {this.f212966d, this.f212967e, this.f212968f};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return java.util.Arrays.deepHashCode(objArr);
    }

    public java.lang.String toString() {
        return "$:" + this.f212966d;
    }

    public h1(android.os.Parcel parcel) {
        this.f212967e = new com.tencent.mm.vfs.f1(parcel.readString());
        this.f212968f = parcel.readString();
        if (parcel.readByte() == 0) {
            this.f212966d = parcel.readParcelable(com.tencent.mm.vfs.h1.class.getClassLoader());
        } else {
            this.f212966d = new com.tencent.mm.vfs.h1(parcel);
        }
        c();
    }
}

package nf4;

/* loaded from: classes4.dex */
public final class o extends dm.fb {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f336877v = dm.fb.initAutoDBInfo(nf4.o.class);

    @Override // dm.fb, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f336877v;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final boolean t0() {
        int i17 = this.field_totalSize;
        return i17 > 0 && this.field_cacheSize == i17;
    }

    public java.lang.String toString() {
        return this.field_storyId + ", " + this.field_filePath + ", cacheSize:" + this.field_cacheSize + ", totalSize:" + this.field_totalSize;
    }

    public final boolean u0() {
        return t0() && com.tencent.mm.vfs.w6.j(this.field_filePath);
    }
}

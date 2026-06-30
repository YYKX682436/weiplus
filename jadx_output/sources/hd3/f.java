package hd3;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f280551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280553f;

    public f(int i17, java.lang.String str, java.lang.String str2) {
        this.f280551d = i17;
        this.f280552e = str;
        this.f280553f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Cpu profile successful! Path is already copied to clipboard, size is " + this.f280551d + ". Use \"adb pull\" to get profile file", 1).show();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cpu profile path: ");
        sb6.append(this.f280552e);
        sb6.append(' ');
        java.lang.String str2 = this.f280553f;
        if (str2 == null || (str = "\n gpu profile path: ".concat(str2)) == null) {
            str = "";
        }
        sb6.append(str);
        com.tencent.mm.sdk.platformtools.b0.e(sb6.toString());
    }
}

package p81;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352718d;

    public f(java.lang.String str) {
        this.f352718d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "状态表情面板预下发结果: " + this.f352718d, 0).show();
    }
}

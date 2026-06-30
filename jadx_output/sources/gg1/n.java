package gg1;

/* loaded from: classes7.dex */
public final class n extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.l f271608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg1.w f271609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg1.p f271610f;

    public n(gg1.l lVar, gg1.w wVar, gg1.p pVar) {
        this.f271608d = lVar;
        this.f271609e = wVar;
        this.f271610f = pVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.h(new gg1.o(this.f271608d, this.f271609e, this.f271610f));
    }
}

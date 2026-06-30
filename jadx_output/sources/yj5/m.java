package yj5;

/* loaded from: classes8.dex */
public final class m implements com.tencent.mm.ui.s9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj5.p f462721d;

    public m(yj5.p pVar) {
        this.f462721d = pVar;
    }

    @Override // com.tencent.mm.ui.s9
    public final void j(java.lang.String str) {
        yj5.p pVar = this.f462721d;
        java.lang.String x17 = pVar.f198580d.x();
        if (kotlin.jvm.internal.o.b(x17, str)) {
            com.tencent.mars.xlog.Log.i("LiveTipsBarProcessor", "liveTipsBarStorage notify, hostRoomId:%s", x17);
            pVar.o0();
        }
    }
}

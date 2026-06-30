package hn;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f282316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f282317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f282318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hn.f f282319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg3.j3 f282320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f282321i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.jvm.internal.h0 h0Var, int i17, int i18, hn.f fVar, vg3.j3 j3Var, android.content.Context context) {
        super(0);
        this.f282316d = h0Var;
        this.f282317e = i17;
        this.f282318f = i18;
        this.f282319g = fVar;
        this.f282320h = j3Var;
        this.f282321i = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f282316d.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        int i17 = this.f282317e;
        vg3.j3 j3Var = this.f282320h;
        if (i17 == 0 && this.f282318f == 0) {
            hn.f fVar = this.f282319g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(fVar.f343218i)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomOpenService", "doAppCreateChatRoom success");
                if (j3Var != null) {
                    j3Var.a(true, null, fVar.f343218i);
                }
                return jz5.f0.f302826a;
            }
        }
        if (j3Var != null) {
            j3Var.a(false, null, null);
        }
        java.lang.String string = this.f282321i.getString(com.tencent.mm.R.string.f492386gb0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, string);
        return jz5.f0.f302826a;
    }
}

package eg4;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f252737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f252738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252740g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f252741h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, java.lang.String str, com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI, int i17, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252737d = u3Var;
        this.f252738e = z17;
        this.f252739f = str;
        this.f252740g = addFriendVerifyRecordUI;
        this.f252741h = i17;
        this.f252742i = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eg4.j0(this.f252737d, this.f252738e, this.f252739f, this.f252740g, this.f252741h, this.f252742i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        eg4.j0 j0Var = (eg4.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f252737d.dismiss();
        boolean z17 = this.f252738e;
        com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI = this.f252740g;
        java.lang.String str = this.f252739f;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "deleteNewData success: " + str);
            addFriendVerifyRecordUI.W6();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFriendVerifyRecordUI", "deleteNewData fail: " + str + ", errorCode=" + this.f252741h + ", errorMsg=" + this.f252742i);
            androidx.appcompat.app.AppCompatActivity context = addFriendVerifyRecordUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.f490368t1);
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}

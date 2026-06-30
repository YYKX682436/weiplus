package eg4;

/* loaded from: classes4.dex */
public final class x0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.c f252829e;

    public x0(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI, in5.c cVar) {
        this.f252828d = addFriendVerifyRecordUI;
        this.f252829e = cVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            int i18 = com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI.f172162p;
            com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI = this.f252828d;
            addFriendVerifyRecordUI.getClass();
            in5.c cVar = this.f252829e;
            if (!(cVar instanceof eg4.h2)) {
                if (cVar instanceof eg4.i2) {
                    com.tencent.mm.storage.m7 m7Var = ((eg4.i2) cVar).f252732d;
                    r21.v.a(m7Var.field_fmsgSysRowId, m7Var.field_talker);
                    addFriendVerifyRecordUI.W6();
                    return;
                }
                return;
            }
            com.tencent.mm.storage.ib ibVar = ((eg4.h2) cVar).f252724d;
            java.lang.String str = ibVar.field_encryptTalker;
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "deleteNewData: " + str);
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(addFriendVerifyRecordUI, addFriendVerifyRecordUI.getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
            xg3.u uVar = (xg3.u) i95.n0.c(xg3.u.class);
            kotlin.jvm.internal.o.d(str);
            java.lang.String str2 = ibVar.field_talker;
            eg4.k0 k0Var = new eg4.k0(addFriendVerifyRecordUI, f17, str);
            ft1.j jVar = (ft1.j) uVar;
            jVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "deleteVerifyRecord: encryptUsername=" + str + ", talker=" + str2);
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) jVar.f266494d).getValue(), null, new ft1.e(str, jVar, k0Var, null), 1, null);
        }
    }
}

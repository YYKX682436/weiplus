package eg4;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI) {
        super(2);
        this.f252702d = addFriendVerifyRecordUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        in5.c data = (in5.c) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI = this.f252702d;
        addFriendVerifyRecordUI.getClass();
        rl5.r rVar = new rl5.r(addFriendVerifyRecordUI, view);
        rVar.f397351u = new eg4.w0(addFriendVerifyRecordUI);
        rVar.f397354x = new eg4.x0(addFriendVerifyRecordUI, data);
        rVar.m();
        return java.lang.Boolean.TRUE;
    }
}

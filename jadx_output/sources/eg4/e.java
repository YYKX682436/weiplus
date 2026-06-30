package eg4;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordConvertFactory f252692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordConvertFactory addFriendVerifyRecordConvertFactory) {
        super(0);
        this.f252692d = addFriendVerifyRecordConvertFactory;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.p pVar;
        pVar = this.f252692d.onItemLongClickListener;
        return new eg4.i0(pVar);
    }
}

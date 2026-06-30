package dk5;

/* loaded from: classes11.dex */
public class y0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f234999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MMCreateChatroomUI f235000e;

    public y0(com.tencent.mm.ui.transmit.MMCreateChatroomUI mMCreateChatroomUI, java.util.LinkedList linkedList) {
        this.f235000e = mMCreateChatroomUI;
        this.f234999d = linkedList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.ui.transmit.MMCreateChatroomUI.f210950J;
        com.tencent.mm.ui.transmit.MMCreateChatroomUI mMCreateChatroomUI = this.f235000e;
        mMCreateChatroomUI.getClass();
        java.util.LinkedList linkedList = this.f234999d;
        iz5.a.g(null, linkedList.size() > 0);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            linkedList2.add(3);
        }
        new r35.e4(mMCreateChatroomUI, new dk5.z0(mMCreateChatroomUI)).f(linkedList, linkedList2, null);
    }
}

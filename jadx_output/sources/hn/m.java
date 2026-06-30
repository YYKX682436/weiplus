package hn;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f282353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282355f;

    public m(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, java.lang.String str, java.lang.String str2) {
        this.f282353d = mMFragmentActivity;
        this.f282354e = str;
        this.f282355f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this.f282353d, "com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI");
        intent.putExtra("key_error_title", this.f282354e);
        intent.putExtra("key_error_content", this.f282355f);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f282353d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMFragmentActivity, arrayList.toArray(), "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppBindChatRoom$2$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMFragmentActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMFragmentActivity, "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppBindChatRoom$2$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

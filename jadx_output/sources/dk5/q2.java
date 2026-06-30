package dk5;

/* loaded from: classes9.dex */
public class q2 implements lo.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234826a;

    public q2(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234826a = selectConversationUI;
    }

    @Override // lo.j
    public void a(int i17, java.lang.String str, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "resultCode:%d filePaths:%s", java.lang.Integer.valueOf(i17), arrayList);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234826a;
        if (i17 == -1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", arrayList);
            selectConversationUI.setResult(-1, intent);
            selectConversationUI.finish();
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("ERRMSG", str);
        selectConversationUI.setResult(1, intent2);
        selectConversationUI.finish();
    }
}

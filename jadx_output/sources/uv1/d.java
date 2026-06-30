package uv1;

@j95.b
/* loaded from: classes12.dex */
public class d extends i95.w implements lo.k {
    /* JADX WARN: Multi-variable type inference failed */
    public void Ai(android.app.Activity activity, java.lang.String str, int i17, java.lang.String str2, lo.j jVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", 11);
        intent.putExtra("Select_Conv_ui_title", activity.getString(com.tencent.mm.R.string.b7h));
        intent.putExtra("KChooseMsgFileType", str);
        intent.putExtra("KChooseMsgFileCount", i17);
        intent.putExtra("KChooseMsgFileExtension", str2);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477857df);
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
        uv1.a aVar = new uv1.a(this, jVar);
        if (activity instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) activity).mmSetOnActivityResultCallback(aVar);
        } else if (activity instanceof com.tencent.mm.ui.MMFragmentActivity) {
            ((com.tencent.mm.ui.MMFragmentActivity) activity).setMMOnFragmentActivityResult(new uv1.b(this, aVar));
        } else if (activity instanceof q80.z) {
            ((q80.z) activity).R1(new uv1.c(this, aVar));
        }
        j45.l.v(activity, ".ui.transmit.SelectConversationUI", intent, lo.a.f319942a);
    }

    public void wi(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, lo.j jVar, java.util.function.Consumer consumer) {
        if ("file".equals(str2)) {
            int i18 = com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI.f95566q;
            android.content.Intent intent = new android.content.Intent(mMFragmentActivity, (java.lang.Class<?>) com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI.class);
            intent.putExtra("USERNAME", str);
            intent.putExtra("COUNT", i17);
            intent.putExtra("EXTENSION", str3);
            if (consumer != null) {
                consumer.accept(intent);
            }
            mMFragmentActivity.setMMOnFragmentActivityResult(new com.tencent.mm.plugin.choosemsgfile.ui.f(jVar));
            mMFragmentActivity.startActivityForResult(intent, lo.a.f319942a);
            return;
        }
        int i19 = com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.f95592y;
        android.content.Intent intent2 = new android.content.Intent(mMFragmentActivity, (java.lang.Class<?>) com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.class);
        intent2.putExtra("USERNAME", str);
        intent2.putExtra("TYPE", str2);
        intent2.putExtra("COUNT", i17);
        intent2.putExtra("EXTENSION", str3);
        if (consumer != null) {
            consumer.accept(intent2);
        }
        mMFragmentActivity.setMMOnFragmentActivityResult(new com.tencent.mm.plugin.choosemsgfile.ui.q(jVar));
        mMFragmentActivity.startActivityForResult(intent2, lo.a.f319942a);
    }
}

package g22;

/* loaded from: classes15.dex */
public final class s implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment f267863d;

    public s(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
        this.f267863d = emojiStoreV3HomeBaseFragment;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (android.text.TextUtils.isEmpty(str) || !kotlin.jvm.internal.o.b(str, "delete_group_v3")) {
            return;
        }
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f267863d;
        com.tencent.mars.xlog.Log.i(emojiStoreV3HomeBaseFragment.f98412d, "IOnStorageChange event:" + str + ", refreshUI");
        java.lang.Object obj = w0Var.f316976d;
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        com.tencent.mm.plugin.emoji.model.q.f97591c.c();
        if (str2 != null) {
            emojiStoreV3HomeBaseFragment.t0(str2, -1);
        }
    }
}

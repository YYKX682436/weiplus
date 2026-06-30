package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129530d;

    public n(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        this.f129530d = finderActivityDescUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI = this.f129530d;
        if (itemId == finderActivityDescUI.D) {
            android.content.Intent intent = finderActivityDescUI.getIntent();
            finderActivityDescUI.getClass();
            intent.removeExtra("key_user_name");
            intent.removeExtra("key_nick_name");
            intent.removeExtra("key_cover_url");
            intent.removeExtra("key_avatar_url");
            intent.removeExtra("key_topic_id");
            intent.removeExtra("key_activity_name");
            intent.removeExtra("key_activity_desc");
            intent.removeExtra("key_activity_end_time");
            intent.putExtra("key_activity_type", 100);
            intent.putExtra("key_activity_already_participate", false);
            intent.putExtra("key_activity_jump_info_list", new java.util.ArrayList());
            intent.putExtra("key_activity_post_wording", "");
            finderActivityDescUI.setResult(-1, finderActivityDescUI.getIntent());
            finderActivityDescUI.finish();
        }
    }
}

package com.tencent.mm.plugin.finder.ui;

/* renamed from: com.tencent.mm.plugin.finder.ui.if, reason: invalid class name */
/* loaded from: classes10.dex */
public final class Cif implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129365d;

    public Cif(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129365d = finderSelectCoverUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129365d;
        finderSelectCoverUI.N1 = true;
        finderSelectCoverUI.getIntent().putExtra("cover_time_ms", finderSelectCoverUI.getIntent().getLongExtra("key_other_cover_time_ms", 0L));
        finderSelectCoverUI.getIntent().putExtra("key_full_cover_path", finderSelectCoverUI.getIntent().getStringExtra("key_other_full_cover_path"));
        int intExtra = finderSelectCoverUI.getIntent().getIntExtra("key_other_cover_select_source", 0);
        finderSelectCoverUI.getIntent().putExtra("key_cover_select_source", intExtra);
        finderSelectCoverUI.getIntent().removeExtra("cover_crop_model");
        finderSelectCoverUI.getIntent().removeExtra("cover_word_info_wrap");
        finderSelectCoverUI.L1 = com.tencent.mm.plugin.finder.ui.td.f129874f;
        finderSelectCoverUI.v7(intExtra, true);
    }
}

package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class g5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderEditTextUI f129287d;

    public g5(com.tencent.mm.plugin.finder.ui.FinderEditTextUI finderEditTextUI) {
        this.f129287d = finderEditTextUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.ui.FinderEditTextUI finderEditTextUI = this.f129287d;
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView = finderEditTextUI.f128563t;
        if (finderEditTextView == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        finderEditTextView.setTextCursorVisible(false);
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView2 = finderEditTextUI.f128563t;
        if (finderEditTextView2 == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0(finderEditTextView2);
        if (b07 != null) {
            com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
            java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102146o + "text_" + java.lang.System.nanoTime() + ".tmp";
            com.tencent.mm.sdk.platformtools.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("postType", 7);
            intent.putExtra("hideDescEdit", true);
            intent.putExtra("postMediaList", arrayList);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hk(finderEditTextUI, intent);
            finderEditTextUI.finish();
        }
        return true;
    }
}

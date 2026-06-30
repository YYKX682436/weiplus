package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class e5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderEditTextUI f129092d;

    public e5(com.tencent.mm.plugin.finder.ui.FinderEditTextUI finderEditTextUI) {
        this.f129092d = finderEditTextUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        int i18 = com.tencent.mm.plugin.finder.ui.FinderEditTextUI.f128562w;
        com.tencent.mm.plugin.finder.ui.FinderEditTextUI finderEditTextUI = this.f129092d;
        android.content.Intent intent = finderEditTextUI.getIntent();
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView = finderEditTextUI.f128563t;
        if (finderEditTextView == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        intent.putExtra("saveText", finderEditTextView.getText());
        finderEditTextUI.getIntent().writeToParcel(obtain, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, ot5.e.a(obtain.marshall()));
        finderEditTextUI.finish();
    }
}

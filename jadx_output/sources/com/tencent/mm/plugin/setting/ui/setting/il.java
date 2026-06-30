package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class il extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.database.Cursor f161163d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161164e;

    /* renamed from: f, reason: collision with root package name */
    public final int f161165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI f161166g;

    public il(com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI settingsRingtoneUI, android.database.Cursor cursor) {
        this.f161166g = settingsRingtoneUI;
        this.f161164e = 0;
        this.f161165f = 0;
        this.f161163d = cursor;
        this.f161164e = cursor.getCount() + 1;
        this.f161165f = settingsRingtoneUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.String getItem(int i17) {
        android.database.Cursor cursor = this.f161163d;
        return (cursor.isClosed() || !cursor.moveToPosition(i17 + (-1))) ? "" : cursor.getString(cursor.getColumnIndex(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f161164e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) this.f161166g.f160628f.inflate(com.tencent.mm.R.layout.cjq, (android.view.ViewGroup) null);
        if (i17 == 0) {
            checkedTextView.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
            checkedTextView.setText(com.tencent.mm.R.string.iui);
        } else if (i17 == this.f161164e - 1) {
            checkedTextView.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
            checkedTextView.setText(getItem(i17));
        } else {
            checkedTextView.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
            checkedTextView.setText(getItem(i17));
        }
        int i18 = this.f161165f;
        checkedTextView.setPadding(i18, 0, i18, 0);
        checkedTextView.setCheckMarkDrawable(com.tencent.mm.R.drawable.axu);
        return checkedTextView;
    }
}

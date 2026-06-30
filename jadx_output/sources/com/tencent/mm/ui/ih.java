package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class ih extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f208926d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f208927e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f208928f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.hh f208929g;

    public ih(android.content.Context context) {
        super(context);
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f487914bg, (android.view.ViewGroup) this, true);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn)).setOnClickListener(new com.tencent.mm.ui.eh(this));
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.mdy);
        this.f208926d = editText;
        editText.requestFocus();
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.bxn);
        this.f208927e = imageButton;
        imageButton.setOnClickListener(new com.tencent.mm.ui.fh(this));
        this.f208926d.addTextChangedListener(new com.tencent.mm.ui.gh(this));
    }

    public android.widget.EditText getSearchEditText() {
        return this.f208926d;
    }

    public void setHint(java.lang.String str) {
        this.f208928f = str;
    }

    public void setSearchViewListener(com.tencent.mm.ui.hh hhVar) {
        this.f208929g = hhVar;
    }
}

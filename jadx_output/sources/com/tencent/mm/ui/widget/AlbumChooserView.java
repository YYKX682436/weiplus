package com.tencent.mm.ui.widget;

/* loaded from: classes10.dex */
public class AlbumChooserView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f211240d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f211241e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f211242f;

    /* renamed from: g, reason: collision with root package name */
    public al5.d f211243g;

    public AlbumChooserView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211242f = false;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487992di, (android.view.ViewGroup) this, true);
        this.f211240d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482821ou);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f482820ot);
        this.f211241e = weImageView;
        weImageView.setRotation(90.0f);
        setOnClickListener(new al5.a(this));
    }

    public void setOnAlbumChooserViewClick(al5.d dVar) {
        this.f211243g = dVar;
    }

    public AlbumChooserView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211242f = false;
        a(context);
    }
}

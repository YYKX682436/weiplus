package com.tencent.mm.plugin.patmsg.ui;

/* loaded from: classes5.dex */
public class AvatarPatImageView extends androidx.appcompat.widget.AppCompatImageView implements mp3.l {

    /* renamed from: f, reason: collision with root package name */
    public mp3.k f152892f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f152893g;

    /* renamed from: h, reason: collision with root package name */
    public pp3.b f152894h;

    public AvatarPatImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // mp3.l
    public mp3.k getDoubleClickListener() {
        return this.f152892f;
    }

    @Override // mp3.l
    public android.view.View.OnClickListener getOnClickListener() {
        return this.f152893g;
    }

    @Override // mp3.l
    public int getTagScene() {
        if (getTag(com.tencent.mm.R.id.f486270kq0) == null) {
            return 0;
        }
        return ((java.lang.Integer) getTag(com.tencent.mm.R.id.f486270kq0)).intValue();
    }

    @Override // mp3.l
    public java.lang.String getTagTalker() {
        return getTag(com.tencent.mm.R.id.f486271kq1) == null ? "" : (java.lang.String) getTag(com.tencent.mm.R.id.f486271kq1);
    }

    @Override // mp3.l
    public java.lang.String getTagUsername() {
        return (java.lang.String) getTag(com.tencent.mm.R.id.f486272kq2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((pp3.j) this.f152894h).a();
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f152893g = onClickListener;
        super.setOnClickListener(((pp3.j) this.f152894h).f357485d);
    }

    public void setOnDoubleClickListener(mp3.k kVar) {
        this.f152892f = kVar;
    }

    public void setTagScene(int i17) {
        setTag(com.tencent.mm.R.id.f486270kq0, java.lang.Integer.valueOf(i17));
    }

    public void setTagTalker(java.lang.String str) {
        setTag(com.tencent.mm.R.id.f486271kq1, str);
    }

    public void setTagUsername(java.lang.String str) {
        java.lang.String tagUsername = getTagUsername();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (tagUsername == null) {
            tagUsername = "";
        }
        if (!tagUsername.equals(str)) {
            ((pp3.j) this.f152894h).a();
        }
        setTag(com.tencent.mm.R.id.f486272kq2, str);
    }

    public AvatarPatImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        ((mb0.e) ((nb0.e) i95.n0.c(nb0.e.class))).getClass();
        pp3.j jVar = new pp3.j();
        this.f152894h = jVar;
        jVar.f357482a = this;
    }
}

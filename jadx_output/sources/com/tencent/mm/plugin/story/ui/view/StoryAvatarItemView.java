package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryAvatarItemView;", "Landroid/widget/RelativeLayout;", "", dm.i4.COL_USERNAME, "Ljz5/f0;", "setAvatar", "", "count", "setTipCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StoryAvatarItemView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f171924d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f171925e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f171926f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f171927g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryAvatarItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        this.f171924d = i65.a.b(getContext(), 2);
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cw7, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487119nk3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f171925e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487120nk4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f171926f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f487121nk5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f171927g = (android.widget.TextView) findViewById3;
    }

    public final void setAvatar(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.feature.avatar.w wVar = (com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class));
        android.widget.ImageView imageView = this.f171925e;
        wVar.Ri(imageView, username, 0.5f);
        imageView.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.b3u));
        int i17 = this.f171924d;
        imageView.setPadding(i17, i17, i17, i17);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        android.widget.TextView textView = this.f171926f;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize));
    }

    public final void setTipCount(int i17) {
        android.widget.TextView textView = this.f171927g;
        if (i17 <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(java.lang.String.valueOf(i17));
            textView.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryAvatarItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        this.f171924d = i65.a.b(getContext(), 2);
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cw7, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487119nk3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f171925e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487120nk4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f171926f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f487121nk5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f171927g = (android.widget.TextView) findViewById3;
    }
}

package com.tencent.mm.plugin.profile.ui.widget;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b/\u00101J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR.\u0010\"\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u00062"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/widget/SayHiItemView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "", "value", "d", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", "e", "Ljava/lang/CharSequence;", "getContent", "()Ljava/lang/CharSequence;", "setContent", "(Ljava/lang/CharSequence;)V", "content", "f", "getHint", "setHint", "hint", "Landroid/graphics/drawable/Drawable;", "g", "Landroid/graphics/drawable/Drawable;", "getImageDrawable", "()Landroid/graphics/drawable/Drawable;", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "imageDrawable", "Lem/t3;", "h", "Ljz5/g;", "getUi", "()Lem/t3;", "ui", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SayHiItemView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public java.lang.String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public java.lang.CharSequence content;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public java.lang.String hint;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.graphics.drawable.Drawable imageDrawable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g ui;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SayHiItemView(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.Integer num, java.lang.Integer num2) {
        super(context, attributeSet, num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0);
        kotlin.jvm.internal.o.g(context, "context");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f396157g);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.title = obtainStyledAttributes.getString(2);
        this.content = obtainStyledAttributes.getString(0);
        this.hint = obtainStyledAttributes.getString(1);
        this.ui = jz5.h.b(new cs3.h(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.emy, this);
        em.t3 ui6 = getUi();
        if (ui6.f254823g == null) {
            ui6.f254823g = (com.tencent.mm.ui.widget.imageview.WeImageView) ui6.f254817a.findViewById(com.tencent.mm.R.id.a4r);
        }
        ui6.f254823g.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_arrow, i65.a.d(getContext(), com.tencent.mm.R.color.BW_70)));
        a();
    }

    public final void a() {
        jz5.f0 f0Var;
        java.lang.String str = this.title;
        if (str != null) {
            em.t3 ui6 = getUi();
            if (ui6.f254822f == null) {
                ui6.f254822f = (android.widget.TextView) ui6.f254817a.findViewById(com.tencent.mm.R.id.v0b);
            }
            ui6.f254822f.setText(str);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            em.t3 ui7 = getUi();
            if (ui7.f254822f == null) {
                ui7.f254822f = (android.widget.TextView) ui7.f254817a.findViewById(com.tencent.mm.R.id.v0b);
            }
            ui7.f254822f.setVisibility(8);
        }
        em.t3 ui8 = getUi();
        if (ui8.f254824h == null) {
            ui8.f254824h = (android.widget.TextView) ui8.f254817a.findViewById(com.tencent.mm.R.id.v0a);
        }
        android.widget.TextView textView = ui8.f254824h;
        java.lang.CharSequence charSequence = this.content;
        if (charSequence == null) {
            charSequence = "";
        }
        textView.setText(charSequence);
        em.t3 ui9 = getUi();
        if (ui9.f254824h == null) {
            ui9.f254824h = (android.widget.TextView) ui9.f254817a.findViewById(com.tencent.mm.R.id.v0a);
        }
        android.widget.TextView textView2 = ui9.f254824h;
        java.lang.String str2 = this.hint;
        textView2.setHint(str2 != null ? str2 : "");
        if (this.imageDrawable == null) {
            getUi().b().setVisibility(8);
        } else {
            getUi().b().setImageDrawable(this.imageDrawable);
            getUi().b().setVisibility(0);
        }
    }

    public final java.lang.CharSequence getContent() {
        return this.content;
    }

    public final java.lang.String getHint() {
        return this.hint;
    }

    public final android.graphics.drawable.Drawable getImageDrawable() {
        return this.imageDrawable;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final em.t3 getUi() {
        return (em.t3) ((jz5.n) this.ui).getValue();
    }

    public final void setContent(java.lang.CharSequence charSequence) {
        this.content = charSequence;
        a();
    }

    public final void setHint(java.lang.String str) {
        this.hint = str;
        a();
    }

    public final void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.imageDrawable = drawable;
        a();
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        getUi().a().setOnClickListener(onClickListener);
    }

    public final void setTitle(java.lang.String str) {
        this.title = str;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SayHiItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, java.lang.Integer.valueOf(i17), 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SayHiItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SayHiItemView(android.content.Context context) {
        this(context, null, 0, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}

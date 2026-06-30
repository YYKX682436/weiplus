package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public final class b1 implements com.tencent.mm.ui.chatting.gallery.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f200800a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f200801b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f200802c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f200803d;

    /* renamed from: e, reason: collision with root package name */
    public final int f200804e;

    /* renamed from: f, reason: collision with root package name */
    public final int f200805f;

    public b1(android.widget.TextView tv6, java.lang.CharSequence longText, java.lang.CharSequence shortText, boolean z17, int i17, int i18) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(longText, "longText");
        kotlin.jvm.internal.o.g(shortText, "shortText");
        this.f200800a = tv6;
        this.f200801b = longText;
        this.f200802c = shortText;
        this.f200803d = z17;
        this.f200804e = i17;
        this.f200805f = i18;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int a() {
        this.f200800a.setText(this.f200802c);
        return getMinWidth();
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int getMinWidth() {
        if (this.f200803d) {
            return ((int) this.f200800a.getPaint().measureText(this.f200802c.toString())) + this.f200804e;
        }
        return 0;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int getPriority() {
        return this.f200805f;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int getWidth() {
        if (this.f200803d) {
            return ((int) this.f200800a.getPaint().measureText(this.f200801b.toString())) + this.f200804e;
        }
        return 0;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int reset() {
        this.f200800a.setText(this.f200801b);
        return getWidth();
    }
}

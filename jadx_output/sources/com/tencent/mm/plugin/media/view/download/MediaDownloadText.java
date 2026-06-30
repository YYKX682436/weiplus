package com.tencent.mm.plugin.media.view.download;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u001a\u0010\r\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/media/view/download/MediaDownloadText;", "Lcom/tencent/mm/plugin/media/view/ShrinkBox;", "Llg3/a;", "Lkg3/o;", "", "visible", "Ljz5/f0;", "setInnerVisible", "Lkotlinx/coroutines/y0;", "s", "Lkotlinx/coroutines/y0;", "getScope", "()Lkotlinx/coroutines/y0;", "scope", "Lvf3/b;", "t", "Lvf3/b;", "getLiveInfo", "()Lvf3/b;", "setLiveInfo", "(Lvf3/b;)V", "liveInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public class MediaDownloadText extends com.tencent.mm.plugin.media.view.ShrinkBox implements lg3.a, kg3.o {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashSet f148581u = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f148582h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f148583i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f148584m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f148585n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f148586o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f148587p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f148588q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f148589r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.y0 scope;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public vf3.b liveInfo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaDownloadText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInnerVisible(boolean z17) {
        android.view.View view = this.f148587p;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "setInnerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "setInnerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // kg3.o
    public void b(boolean z17) {
        e();
    }

    public final void d(android.widget.TextView textView) {
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(getContext())));
        com.tencent.mm.ui.dl.i(textView.getPaint());
    }

    public final void e() {
        java.lang.String sb6;
        java.lang.String str;
        vf3.b bVar = this.liveInfo;
        if (bVar != null) {
            long j17 = bVar.f436366b + bVar.f436368d;
            if (j17 < 0) {
                sb6 = "";
            } else {
                java.math.BigDecimal bigDecimal = new java.math.BigDecimal(j17);
                float floatValue = bigDecimal.divide(new java.math.BigDecimal(1048576), 2, 0).floatValue();
                if (floatValue > 1.0f) {
                    sb6 = ((int) floatValue) + "MB";
                } else {
                    float floatValue2 = bigDecimal.divide(new java.math.BigDecimal(1024), 2, 0).floatValue();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append((int) floatValue2);
                    sb7.append('K');
                    sb6 = sb7.toString();
                }
            }
            if (this.f148575f) {
                str = this.f148589r;
                if (str == null) {
                    str = i65.a.r(getContext(), com.tencent.mm.R.string.f492197o53);
                }
            } else {
                str = this.f148588q;
                if (str == null) {
                    str = i65.a.r(getContext(), com.tencent.mm.R.string.f492196o52);
                }
            }
            android.widget.TextView textView = this.f148582h;
            textView.setText(str);
            android.text.SpannableString spannableString = new android.text.SpannableString(sb6);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(getContext().getColor(com.tencent.mm.R.color.adi)), 0, sb6.length(), 33);
            textView.append(" ");
            textView.append(spannableString);
            getLayoutParams().width = ((int) textView.getPaint().measureText(textView.getText().toString())) + ((int) (i65.a.h(getContext(), com.tencent.mm.R.dimen.f479672c9) * 2));
        }
    }

    public void f() {
        setVisibility(0);
    }

    public void g(vf3.b bVar) {
        this.liveInfo = bVar;
        e();
    }

    public final vf3.b getLiveInfo() {
        return this.liveInfo;
    }

    public final kotlinx.coroutines.y0 getScope() {
        return this.scope;
    }

    public void h(mf3.k info, vf3.f stateInfo) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(stateInfo, "stateInfo");
        clearAnimation();
        vf3.e eVar = stateInfo.f436389a;
        if (info.getLevel() == mf3.w.f326128d) {
            f();
            eVar = vf3.e.f436377d;
        }
        info.getId();
        java.util.Objects.toString(eVar);
        int ordinal = eVar.ordinal();
        android.view.ViewGroup viewGroup = this.f148583i;
        android.widget.TextView textView = this.f148582h;
        switch (ordinal) {
            case 0:
            case 6:
                setInnerVisible(true);
                textView.setVisibility(0);
                e();
                viewGroup.setVisibility(8);
                android.view.View view = this.f148585n;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f148586o;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            case 1:
                setInnerVisible(false);
                textView.setVisibility(4);
                viewGroup.setVisibility(8);
                android.view.View view3 = this.f148586o;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            case 2:
            case 3:
                setInnerVisible(true);
                textView.setVisibility(4);
                info.getId();
                eVar.toString();
                viewGroup.setVisibility(0);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append((int) (stateInfo.f436392d * 100.0f));
                sb6.append('%');
                this.f148584m.setText(sb6.toString());
                android.view.View view4 = this.f148585n;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = this.f148586o;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            case 4:
                setInnerVisible(true);
                textView.setVisibility(4);
                viewGroup.setVisibility(8);
                android.view.View view6 = this.f148585n;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view7 = this.f148586o;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f148581u.add(info.getId());
                kotlinx.coroutines.l.d(this.scope, null, null, new lg3.c(this, null), 3, null);
                return;
            case 5:
                setInnerVisible(false);
                textView.setVisibility(4);
                viewGroup.setVisibility(8);
                android.view.View view8 = this.f148586o;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            default:
                return;
        }
    }

    public final void setLiveInfo(vf3.b bVar) {
        this.liveInfo = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDownloadText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.scope = kotlinx.coroutines.z0.b();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o23.o.f342454b, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f148588q = obtainStyledAttributes.getString(0);
        this.f148589r = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eje, (android.view.ViewGroup) this, true);
        setShrinkListener(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.viw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f148582h = textView;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.u1m);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f148583i = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.u1n);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f148584m = textView2;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.u1l);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f148585n = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.u1j);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f148586o = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.u4s);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f148587p = findViewById6;
        d(textView);
        d(textView2);
    }
}

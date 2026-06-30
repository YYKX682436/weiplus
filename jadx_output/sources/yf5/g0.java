package yf5;

/* loaded from: classes11.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f461876a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f461877b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f461878c;

    /* renamed from: d, reason: collision with root package name */
    public final int f461879d;

    /* renamed from: e, reason: collision with root package name */
    public final int f461880e;

    /* renamed from: f, reason: collision with root package name */
    public final float f461881f;

    /* renamed from: g, reason: collision with root package name */
    public final float f461882g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f461883h;

    /* renamed from: i, reason: collision with root package name */
    public final db5.v8 f461884i;

    public g0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f461876a = context;
        this.f461877b = "MicroMsg.ConversationAdapter.ConversationItemBuilder";
        this.f461878c = r0;
        this.f461881f = -1.0f;
        this.f461882g = -1.0f;
        android.content.res.ColorStateList[] colorStateListArr = {i65.a.e(context, com.tencent.mm.R.color.f479232tk), i65.a.e(context, com.tencent.mm.R.color.f479482a31), i65.a.e(context, com.tencent.mm.R.color.f478524a5), i65.a.e(context, com.tencent.mm.R.color.a0c), i65.a.e(context, com.tencent.mm.R.color.f479232tk)};
        if (i65.a.E(context)) {
            context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479617as);
            context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479618at);
        } else if (i65.a.D(context)) {
            context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479616ar);
            context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479618at);
        } else {
            context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479615aq);
            context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479619au);
        }
        this.f461879d = (int) (context.getResources().getDimension(com.tencent.mm.R.dimen.f479896i9) + 0.5f);
        this.f461880e = (int) (context.getResources().getDimension(com.tencent.mm.R.dimen.f479872hl) + 0.5f);
        this.f461881f = i65.a.h(context, com.tencent.mm.R.dimen.f479897ia);
        i65.a.h(context, com.tencent.mm.R.dimen.f479853h2);
        i65.a.h(context, com.tencent.mm.R.dimen.f479930ja);
        this.f461882g = i65.a.h(context, com.tencent.mm.R.dimen.f479929j9);
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_bellring_off, context.getResources().getColor(com.tencent.mm.R.color.f478694eb));
        kotlin.jvm.internal.o.f(e17, "getColorDrawable(...)");
        this.f461883h = e17;
        this.f461884i = new yf5.e0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r29, yf5.n r30, yf5.x r31, com.tencent.mm.storage.l4 r32) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf5.g0.a(int, yf5.n, yf5.x, com.tencent.mm.storage.l4):void");
    }

    public final void b(yf5.n holder, android.view.View contentView) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(contentView, "contentView");
        android.widget.ImageView imageView = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.a_4);
        holder.f461914a = imageView;
        imageView.getViewTreeObserver().addOnPreDrawListener(new yf5.d0(holder));
        holder.f461930q = contentView.findViewById(com.tencent.mm.R.id.f483944cj1);
        holder.f461931r = contentView.findViewById(com.tencent.mm.R.id.f483943cj0);
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = (com.tencent.mm.ui.base.NoMeasuredTextView) contentView.findViewById(com.tencent.mm.R.id.kbq);
        holder.f461915b = noMeasuredTextView;
        noMeasuredTextView.setLayoutCallback(this.f461884i);
        holder.f461916c = contentView.findViewById(com.tencent.mm.R.id.f487283ve5);
        holder.f461917d = (com.tencent.mm.ui.conversation.ChatBotConversationTextLine) contentView.findViewById(com.tencent.mm.R.id.spo);
        holder.f461918e = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.otg);
        holder.f461919f = (com.tencent.mm.ui.base.NoMeasuredTextView) contentView.findViewById(com.tencent.mm.R.id.f485478ht5);
        holder.f461920g = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.o_u);
        holder.f461921h = (com.tencent.mm.ui.widget.imageview.WeImageView) contentView.findViewById(com.tencent.mm.R.id.h_5);
        holder.f461925l = contentView.findViewById(com.tencent.mm.R.id.a_h);
        holder.f461922i = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.f21int);
        holder.f461923j = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.jwh);
        holder.f461924k = (com.tencent.mm.ui.widget.imageview.WeImageView) contentView.findViewById(com.tencent.mm.R.id.f486707m74);
        holder.f461932s = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.mj_);
        holder.f461933t = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.g_u);
        holder.f461935v = (android.widget.LinearLayout) contentView.findViewById(com.tencent.mm.R.id.f483943cj0);
        holder.f461936w = (android.widget.LinearLayout) contentView.findViewById(com.tencent.mm.R.id.ciy);
        android.widget.TextView textView = holder.f461920g;
        android.content.Context context = this.f461876a;
        textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.a(context));
        holder.f461920g.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(context));
        contentView.setTag(holder);
        contentView.setTag(com.tencent.mm.R.id.ohu, new int[2]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/conversation/adapter/ConversationItemBuilder", "initViewHolder", "(Lcom/tencent/mm/ui/conversation/adapter/ConvViewHolder;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        contentView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/conversation/adapter/ConversationItemBuilder", "initViewHolder", "(Lcom/tencent/mm/ui/conversation/adapter/ConvViewHolder;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        holder.f461919f.i(0, this.f461882g);
        holder.f461915b.i(0, this.f461881f);
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView2 = holder.f461919f;
        android.content.res.ColorStateList[] colorStateListArr = this.f461878c;
        noMeasuredTextView2.setTextColor(colorStateListArr[0]);
        holder.f461918e.setTextColor(colorStateListArr[4]);
        holder.f461915b.setTextColor(colorStateListArr[3]);
        holder.f461919f.setShouldEllipsize(true);
        holder.f461915b.setShouldEllipsize(true);
        if (holder.f461915b.getPaint() != null) {
            com.tencent.mm.ui.bk.r0(holder.f461915b.getPaint(), 0.1f);
        }
        holder.f461918e.setGravity(5);
    }
}

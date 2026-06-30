package ir;

/* loaded from: classes15.dex */
public final class y extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final ir.h f293914f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.constraintlayout.widget.Guideline f293915g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f293916h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f293917i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f293918m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(android.view.ViewGroup r4, lr.k0 r5, ir.h r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.g(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131494463(0x7f0c063f, float:1.8612435E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.o.f(r4, r0)
            r3.<init>(r4, r5)
            r3.f293914f = r6
            android.view.View r4 = r3.itemView
            r5 = 2131303534(0x7f091c6e, float:1.8225185E38)
            android.view.View r4 = r4.findViewById(r5)
            androidx.constraintlayout.widget.Guideline r4 = (androidx.constraintlayout.widget.Guideline) r4
            r3.f293915g = r4
            android.view.View r4 = r3.itemView
            r5 = 2131303529(0x7f091c69, float:1.8225175E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.view.View r5 = r3.itemView
            r6 = 2131303530(0x7f091c6a, float:1.8225177E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r6 = r3.itemView
            r0 = 2131303531(0x7f091c6b, float:1.822518E38)
            android.view.View r6 = r6.findViewById(r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 3
            android.widget.ImageView[] r0 = new android.widget.ImageView[r0]
            r0[r2] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 2
            r0[r4] = r6
            java.util.List r4 = kz5.c0.i(r0)
            r3.f293916h = r4
            android.view.View r4 = r3.itemView
            r5 = 2131303532(0x7f091c6c, float:1.8225181E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f293917i = r4
            android.view.View r4 = r3.itemView
            r5 = 2131303527(0x7f091c67, float:1.822517E38)
            android.view.View r4 = r4.findViewById(r5)
            r3.f293918m = r4
            android.view.View r5 = r3.itemView
            r6 = 0
            r5.setOnClickListener(r6)
            ir.x r5 = new ir.x
            r5.<init>(r3)
            r4.setOnClickListener(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.y.<init>(android.view.ViewGroup, lr.k0, ir.h):void");
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        androidx.constraintlayout.widget.Guideline guideline = this.f293915g;
        android.view.ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = this.f293918m.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3;
        ir.h hVar = this.f293914f;
        if (hVar != null && hVar.f293855n) {
            layoutParams2.f10879a = i65.a.b(guideline.getContext(), 120);
            layoutParams4.f10899k = 0;
            layoutParams4.f10895i = -1;
        } else {
            layoutParams2.f10879a = i65.a.b(guideline.getContext(), 48);
            layoutParams4.f10899k = -1;
            layoutParams4.f10895i = com.tencent.mm.R.id.dcp;
        }
        guideline.setLayoutParams(layoutParams2);
        ir.w wVar = (ir.w) this.f320581e;
        if (wVar != null) {
            yo0.f fVar = new yo0.f();
            fVar.f464078b = true;
            yo0.i a17 = fVar.a();
            vo0.e eVar = vo0.e.f438467a;
            vo0.a aVar = vo0.e.f438468b;
            ir.v vVar = wVar.f293910b;
            wo0.c a18 = aVar.a(vVar.f293909c.d());
            a18.f447872c = a17;
            android.widget.ImageView imageView = this.f293917i;
            kotlin.jvm.internal.o.d(imageView);
            ((wo0.b) a18).c(imageView);
            int i17 = 0;
            for (java.lang.Object obj : this.f293916h) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.widget.ImageView imageView2 = (android.widget.ImageView) obj;
                com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = (com.tencent.mm.storage.emotion.EmojiGroupInfo) kz5.n0.a0(vVar.f293909c.f293905c, i17);
                if (emojiGroupInfo != null) {
                    imageView2.setVisibility(0);
                    vo0.e eVar2 = vo0.e.f438467a;
                    vo0.a aVar2 = vo0.e.f438468b;
                    java.lang.String str = emojiGroupInfo.field_packGrayIconUrl;
                    kotlin.jvm.internal.o.f(str, "getGrayPackIconUrl(...)");
                    wo0.c a19 = aVar2.a(str);
                    a19.f447872c = a17;
                    ((wo0.b) a19).c(imageView2);
                } else {
                    imageView2.setVisibility(8);
                }
                i17 = i18;
            }
        }
    }
}

package com.tencent.mm.plugin.pwdgroup.ui.widget;

/* loaded from: classes15.dex */
public class MMPwdInputView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f154799d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f154800e;

    /* renamed from: f, reason: collision with root package name */
    public int f154801f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f154802g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f154803h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f154804i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f154805m;

    /* renamed from: n, reason: collision with root package name */
    public gs3.e f154806n;

    public MMPwdInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public final void a() {
        java.lang.StringBuilder sb6 = this.f154799d;
        if (sb6 != null) {
            this.f154801f = sb6.length();
        } else {
            this.f154801f = 0;
        }
        if (this.f154801f >= 4) {
            this.f154800e = true;
        } else {
            this.f154800e = false;
        }
        gs3.e eVar = this.f154806n;
        if (eVar != null) {
            boolean z17 = this.f154800e;
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = ((fs3.n) eVar).f266312a;
            facingCreateChatRoomAllInOneUI.f154758m = sb7;
            if (z17) {
                facingCreateChatRoomAllInOneUI.f154754f = true;
                com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.U6(facingCreateChatRoomAllInOneUI);
            }
        }
    }

    public void b() {
        int i17 = this.f154801f;
        if (i17 > 0) {
            this.f154799d.delete(0, i17);
        }
        a();
        c();
    }

    public final void c() {
        for (int i17 = 0; i17 < 4; i17++) {
            java.lang.String str = this.f154801f > i17 ? this.f154799d.toString().charAt(i17) + "" : "";
            if (i17 == 0) {
                d(this.f154802g, str);
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((ir3.b) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(ir3.b.class)).setValue("title_num_1", str);
                com.tencent.mars.xlog.Log.i("MicroMsg.Facing.MMPwdInputView", "1, number = " + str);
            } else if (i17 == 1) {
                d(this.f154803h, str);
                android.content.Context context2 = getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((ir3.b) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(ir3.b.class)).setValue("title_num_2", str);
                com.tencent.mars.xlog.Log.i("MicroMsg.Facing.MMPwdInputView", "2, number = " + str);
            } else if (i17 == 2) {
                d(this.f154804i, str);
                android.content.Context context3 = getContext();
                kotlin.jvm.internal.o.g(context3, "context");
                pf5.z zVar3 = pf5.z.f353948a;
                if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((ir3.b) zVar3.a((androidx.appcompat.app.AppCompatActivity) context3).a(ir3.b.class)).setValue("title_num_3", str);
                com.tencent.mars.xlog.Log.i("MicroMsg.Facing.MMPwdInputView", "3, number = " + str);
            } else if (i17 != 3) {
                continue;
            } else {
                d(this.f154805m, str);
                android.content.Context context4 = getContext();
                kotlin.jvm.internal.o.g(context4, "context");
                pf5.z zVar4 = pf5.z.f353948a;
                if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((ir3.b) zVar4.a((androidx.appcompat.app.AppCompatActivity) context4).a(ir3.b.class)).setValue("title_num_4", str);
                com.tencent.mars.xlog.Log.i("MicroMsg.Facing.MMPwdInputView", "4, number = " + str);
            }
        }
    }

    public final void d(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null) {
            return;
        }
        if (str.equals("0")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bvx);
            return;
        }
        if (str.equals("1")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bvy);
            return;
        }
        if (str.equals("2")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bvz);
            return;
        }
        if (str.equals("3")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f480859bw0);
            return;
        }
        if (str.equals("4")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f480860bw1);
            return;
        }
        if (str.equals("5")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f480861bw2);
            return;
        }
        if (str.equals("6")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f480862bw3);
            return;
        }
        if (str.equals("7")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f480863bw4);
            return;
        }
        if (str.equals("8")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f480864bw5);
        } else if (str.equals("9")) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bw6);
        } else {
            imageView.setImageResource(com.tencent.mm.R.drawable.bw7);
        }
    }

    public void setNumberStyle(gs3.f fVar) {
    }

    public void setNumberWidth(int i17) {
        android.widget.ImageView imageView = this.f154802g;
        if (imageView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i17;
            this.f154802g.setLayoutParams(layoutParams);
            this.f154803h.setLayoutParams(layoutParams);
            this.f154804i.setLayoutParams(layoutParams);
            this.f154805m.setLayoutParams(layoutParams);
        }
    }

    public void setOnFinishInputListener(gs3.e eVar) {
        this.f154806n = eVar;
    }

    public MMPwdInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f154799d = new java.lang.StringBuilder();
        this.f154800e = false;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cba, null);
        this.f154802g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.g6k);
        this.f154803h = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.mfv);
        this.f154804i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.o5y);
        this.f154805m = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.gd6);
        this.f154802g.setImageResource(com.tencent.mm.R.drawable.bw7);
        this.f154803h.setImageResource(com.tencent.mm.R.drawable.bw7);
        this.f154804i.setImageResource(com.tencent.mm.R.drawable.bw7);
        this.f154805m.setImageResource(com.tencent.mm.R.drawable.bw7);
        addView(inflate);
    }
}

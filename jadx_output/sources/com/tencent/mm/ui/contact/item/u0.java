package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class u0 extends com.tencent.mm.ui.contact.item.a {
    public com.tencent.mm.ui.contact.item.e1 C;
    public android.content.Context D;
    public java.lang.String E;
    public java.lang.Integer F;
    public java.lang.String G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f206936J;
    public final boolean K;
    public int L;
    public final jz5.g M;
    public final jz5.g N;

    public u0(int i17) {
        super(0, i17);
        ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        this.f206936J = com.tencent.mm.ui.chatting.hd.k();
        ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        this.K = com.tencent.mm.ui.chatting.hd.j();
        this.M = jz5.h.b(new com.tencent.mm.ui.contact.item.t0(this));
        this.N = jz5.h.b(new com.tencent.mm.ui.contact.item.s0(this));
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        this.D = context;
        if (bVar instanceof com.tencent.mm.ui.contact.item.o0) {
            this.E = context != null ? context.getString(com.tencent.mm.R.string.iex) : null;
            g(context);
        }
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return (com.tencent.mm.ui.contact.item.r0) ((jz5.n) this.M).getValue();
    }

    public void g(android.content.Context context) {
        boolean z17 = this.I;
        int i17 = 0;
        if (z17) {
            boolean z18 = this.K;
            boolean z19 = this.f206936J;
            if (z19 && z18) {
                i17 = 3;
            } else if (z19) {
                i17 = 1;
            } else if (z18) {
                i17 = 2;
            }
        }
        this.L = i17;
        if (!z17) {
            if (this.f206836e) {
                this.G = context != null ? context.getString(com.tencent.mm.R.string.ifk) : null;
                this.F = java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_contacts);
                return;
            } else {
                this.G = context != null ? context.getString(com.tencent.mm.R.string.iew) : null;
                this.F = null;
                return;
            }
        }
        this.F = null;
        if (this.f206836e) {
            if (context != null) {
                r3 = context.getString(com.tencent.mm.R.string.ifk);
            }
        } else if (context != null) {
            r3 = context.getString(com.tencent.mm.R.string.iew);
        }
        this.G = r3;
    }

    public void h(int i17) {
        android.content.Context context = this.D;
        if (context != null) {
            com.tencent.mm.ui.contact.item.o0 o0Var = (com.tencent.mm.ui.contact.item.o0) ((jz5.n) this.N).getValue();
            android.widget.RelativeLayout relativeLayout = o0Var.f206909a;
            if (relativeLayout != null) {
                relativeLayout.setBackground(context.getResources().getDrawable(i17));
            }
            android.widget.LinearLayout linearLayout = o0Var.f206911c;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setBackground(context.getResources().getDrawable(i17));
        }
    }
}

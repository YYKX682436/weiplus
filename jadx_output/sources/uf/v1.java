package uf;

/* loaded from: classes7.dex */
public final class v1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f427115d;

    public v1(uf.c2 c2Var) {
        this.f427115d = c2Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        uf.c2 c2Var = this.f427115d;
        return uf.c2.a(c2Var) ? c2Var.f426996f.f426985d.size() + c2Var.f426996f.f426984c.size() + 2 : c2Var.f426996f.f426984c.size() + c2Var.f426996f.f426985d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        uf.c2 c2Var = this.f427115d;
        if (i17 == 0 && uf.c2.a(c2Var)) {
            return 1;
        }
        return (i17 == 0 || (uf.c2.a(c2Var) && i17 == c2Var.f426996f.f426985d.size() + 1)) ? 2 : 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        int itemViewType = getItemViewType(i17);
        if (itemViewType == 1) {
            uf.s1 s1Var = (uf.s1) viewHolder;
            s1Var.f427101e.setVisibility(8);
            boolean a17 = uf.c2.a(this.f427115d);
            android.widget.TextView textView = s1Var.f427100d;
            if (a17) {
                textView.setText("最近连接");
                return;
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        if (itemViewType == 2) {
            uf.s1 s1Var2 = (uf.s1) viewHolder;
            s1Var2.f427100d.setText(uf.c2.a(this.f427115d) ? y(com.tencent.mm.R.string.f490339s8) : y(com.tencent.mm.R.string.f490337s6));
            ku5.u0 u0Var = ku5.t0.f312615d;
            uf.u1 u1Var = new uf.u1(s1Var2, this.f427115d, this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(u1Var, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, false);
            return;
        }
        if (itemViewType != 3) {
            return;
        }
        uf.r1 r1Var = (uf.r1) viewHolder;
        int i18 = i17 - 1;
        android.widget.FrameLayout frameLayout = r1Var.f427094e;
        uf.c2 c2Var = this.f427115d;
        frameLayout.setOnClickListener(new uf.t1(c2Var, i18, this, i17));
        gg1.i x17 = x(i18);
        x17.toString();
        x91.h hVar = x17.f271568a;
        x91.c cVar = hVar.f452647a;
        kotlin.jvm.internal.o.d(cVar);
        java.lang.String friendlyName = cVar.f452639g;
        kotlin.jvm.internal.o.f(friendlyName, "friendlyName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(friendlyName)) {
            kotlin.jvm.internal.o.d(hVar.f452647a);
            kotlin.jvm.internal.o.f(null, "modeName");
            throw null;
        }
        r1Var.f427093d.setText(friendlyName);
        boolean z17 = c2Var.f426995e;
        android.widget.TextView textView2 = r1Var.f427097h;
        android.widget.ImageView imageView = r1Var.f427096g;
        android.widget.ProgressBar progressBar = r1Var.f427095f;
        if (!z17) {
            progressBar.setVisibility(8);
            imageView.setVisibility(8);
            textView2.setVisibility(8);
            return;
        }
        boolean z18 = x17.f271571d;
        if (z18 && x17.f271569b && !x17.f271570c) {
            progressBar.setVisibility(0);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        if (!z18 && x17.f271570c && x17.f271569b) {
            progressBar.setVisibility(8);
            textView2.setVisibility(8);
            imageView.setVisibility(0);
        } else if (!x17.f271570c && x17.f271569b) {
            progressBar.setVisibility(8);
            textView2.setVisibility(8);
            imageView.setVisibility(0);
        } else {
            if (x17.f271569b) {
                return;
            }
            progressBar.setVisibility(8);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        uf.c2 c2Var = this.f427115d;
        if (i17 == 3) {
            android.view.View inflate = android.view.LayoutInflater.from(c2Var.f426998h).inflate(com.tencent.mm.R.layout.bmj, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new uf.r1(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(c2Var.f426998h).inflate(com.tencent.mm.R.layout.bpm, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new uf.s1(this, inflate2);
    }

    public final gg1.i x(int i17) {
        gg1.i iVar;
        uf.c2 c2Var = this.f427115d;
        if ((!c2Var.f426996f.f426985d.isEmpty()) && i17 <= c2Var.f426996f.f426985d.size()) {
            java.lang.Object obj = c2Var.f426996f.f426985d.get(i17);
            kotlin.jvm.internal.o.d(obj);
            return (gg1.i) obj;
        }
        if (!c2Var.f426996f.f426985d.isEmpty()) {
            iVar = (gg1.i) c2Var.f426996f.f426984c.get((i17 - r0.f426985d.size()) - 1);
        } else {
            iVar = (gg1.i) c2Var.f426996f.f426984c.get(i17);
        }
        kotlin.jvm.internal.o.d(iVar);
        return iVar;
    }

    public final java.lang.String y(int i17) {
        android.content.Context context = this.f427115d.f426998h;
        if (context == null) {
            return "";
        }
        java.lang.String string = context.getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}

package gg1;

/* loaded from: classes7.dex */
public final class p extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.w f271616d;

    public p(gg1.w wVar) {
        this.f271616d = wVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        gg1.w wVar = this.f271616d;
        return gg1.w.a(wVar) ? wVar.f271635e.f271592e.size() + wVar.f271635e.f271591d.size() + 2 : wVar.f271635e.f271591d.size() + wVar.f271635e.f271592e.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        gg1.w wVar = this.f271616d;
        if (i17 == 0 && gg1.w.a(wVar)) {
            return 1;
        }
        return (i17 == 0 || (gg1.w.a(wVar) && i17 == wVar.f271635e.f271592e.size() + 1)) ? 2 : 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        int itemViewType = getItemViewType(i17);
        gg1.w wVar = this.f271616d;
        if (itemViewType == 1) {
            gg1.l lVar = (gg1.l) viewHolder;
            lVar.f271599e.setVisibility(8);
            boolean a17 = gg1.w.a(wVar);
            android.widget.TextView textView = lVar.f271598d;
            if (a17) {
                textView.setText("最近连接");
                return;
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        if (itemViewType == 2) {
            gg1.l lVar2 = (gg1.l) viewHolder;
            lVar2.f271598d.setText(gg1.w.a(wVar) ? y(com.tencent.mm.R.string.f490339s8) : y(com.tencent.mm.R.string.f490337s6));
            new java.util.Timer("progressBarHolder", false).schedule(new gg1.n(lVar2, wVar, this), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
            return;
        }
        if (itemViewType != 3) {
            return;
        }
        gg1.k kVar = (gg1.k) viewHolder;
        int i18 = i17 - 1;
        kVar.f271581e.setOnClickListener(new gg1.m(wVar, i18, this, i17));
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
        kVar.f271580d.setText(friendlyName);
        boolean z17 = wVar.f271636f;
        android.widget.TextView textView2 = kVar.f271584h;
        android.widget.ImageView imageView = kVar.f271583g;
        android.widget.ProgressBar progressBar = kVar.f271582f;
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
        } else if (!x17.f271570c && x17.f271569b && !z18) {
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
        gg1.w wVar = this.f271616d;
        if (i17 == 3) {
            android.view.View inflate = android.view.LayoutInflater.from(wVar.f271638h).inflate(com.tencent.mm.R.layout.bmj, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new gg1.k(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(wVar.f271638h).inflate(com.tencent.mm.R.layout.bpm, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new gg1.l(this, inflate2);
    }

    public final gg1.i x(int i17) {
        gg1.i iVar;
        gg1.w wVar = this.f271616d;
        if ((!wVar.f271635e.f271592e.isEmpty()) && i17 <= wVar.f271635e.f271592e.size()) {
            java.lang.Object obj = wVar.f271635e.f271592e.get(i17);
            kotlin.jvm.internal.o.d(obj);
            return (gg1.i) obj;
        }
        if (!wVar.f271635e.f271592e.isEmpty()) {
            iVar = (gg1.i) wVar.f271635e.f271591d.get((i17 - r0.f271592e.size()) - 1);
        } else {
            iVar = (gg1.i) wVar.f271635e.f271591d.get(i17);
        }
        kotlin.jvm.internal.o.d(iVar);
        return iVar;
    }

    public final java.lang.String y(int i17) {
        android.content.Context context = this.f271616d.f271638h;
        if (context == null) {
            return "";
        }
        java.lang.String string = context.getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}

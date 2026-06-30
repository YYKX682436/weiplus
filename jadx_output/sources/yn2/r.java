package yn2;

/* loaded from: classes2.dex */
public class r extends in5.r {

    /* renamed from: f, reason: collision with root package name */
    public static final yn2.o f464007f = new yn2.o(null);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.e f464008e;

    public r(com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar) {
        this.f464008e = eVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dk_;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.cut);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = this.f464008e;
        if (eVar != null) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(holder.itemView, "watch_later_card");
            aVar.Tj(holder.itemView, 40, 1, true);
            aVar.Ai(holder.itemView, new xn2.c0(holder, (xn2.p0) eVar));
        }
    }

    public java.lang.String n() {
        return "Finder.MegaVideo.SeeLaterCardConvert";
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r13 == null) goto L12;
     */
    @Override // in5.r
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r10, zn2.c r11, int r12, int r13, boolean r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.r.h(in5.s0, zn2.c, int, int, boolean, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x002f, B:9:0x0037, B:12:0x0040, B:17:0x004c, B:18:0x007a, B:20:0x0088, B:22:0x0090, B:23:0x0096, B:27:0x00a7, B:28:0x00ae), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x002f, B:9:0x0037, B:12:0x0040, B:17:0x004c, B:18:0x007a, B:20:0x0088, B:22:0x0090, B:23:0x0096, B:27:0x00a7, B:28:0x00ae), top: B:2:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(in5.s0 r20, zn2.c r21, int r22) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.r.p(in5.s0, zn2.c, int):void");
    }
}

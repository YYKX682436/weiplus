package vi5;

/* loaded from: classes.dex */
public class h implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f437631a;

    /* renamed from: b, reason: collision with root package name */
    public final p13.y f437632b;

    /* renamed from: c, reason: collision with root package name */
    public final p13.r f437633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f437634d;

    public h(long j17, p13.y yVar, p13.r rVar, int i17, int i18, kotlin.jvm.internal.i iVar) {
        j17 = (i18 & 1) != 0 ? 0L : j17;
        yVar = (i18 & 2) != 0 ? null : yVar;
        rVar = (i18 & 4) != 0 ? null : rVar;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        this.f437631a = j17;
        this.f437632b = yVar;
        this.f437633c = rVar;
        this.f437634d = i17;
    }

    @Override // si5.c
    public int a() {
        return 0;
    }

    @Override // si5.c
    public int b(ri5.j thisItem, ri5.j otherItem, si5.c other) {
        kotlin.jvm.internal.o.g(thisItem, "thisItem");
        kotlin.jvm.internal.o.g(otherItem, "otherItem");
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof vi5.h)) {
            return 0;
        }
        int i17 = thisItem.f396110e;
        int i18 = kotlin.jvm.internal.o.i(i17, otherItem.f396110e);
        if (i18 != 0) {
            return i18;
        }
        ri5.h hVar = ri5.j.I;
        if (i17 == ri5.j.W) {
            return kotlin.jvm.internal.o.i(this.f437634d, ((vi5.h) other).f437634d);
        }
        int compare = java.lang.Boolean.compare(otherItem.f396126w, thisItem.f396126w);
        return compare != 0 ? compare : kotlin.jvm.internal.o.j(((vi5.h) other).f437631a, this.f437631a);
    }

    @Override // si5.c
    public void c(em.o2 uiBinding, in5.s0 holder, ri5.j item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(uiBinding, "uiBinding");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.c(uiBinding, holder, item, i17, i18, z17, list);
        com.tencent.mm.ui.widget.imageview.WeImageView e17 = uiBinding.e();
        if (e17.getVisibility() == 0) {
            e17.setOnClickListener(new vi5.g(this, holder, item));
        }
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        ri5.h hVar = ri5.j.I;
        return item.f396110e == ri5.j.W;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof vi5.h)) {
            return false;
        }
        vi5.h hVar = (vi5.h) other;
        return this.f437631a == hVar.f437631a && kotlin.jvm.internal.o.b(this.f437632b, hVar.f437632b) && kotlin.jvm.internal.o.b(this.f437633c, hVar.f437633c) && this.f437634d == hVar.f437634d;
    }
}

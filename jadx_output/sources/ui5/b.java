package ui5;

/* loaded from: classes.dex */
public final class b implements si5.c {

    /* renamed from: g, reason: collision with root package name */
    public static final ui5.a f428141g = new ui5.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f428142a;

    /* renamed from: b, reason: collision with root package name */
    public final p13.l f428143b;

    /* renamed from: c, reason: collision with root package name */
    public final p13.r f428144c;

    /* renamed from: d, reason: collision with root package name */
    public final int f428145d;

    /* renamed from: e, reason: collision with root package name */
    public int f428146e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f428147f;

    static {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
    }

    public b(com.tencent.mm.storage.a3 chatroomMember, p13.l lVar, p13.r rVar, int i17, int i18, java.lang.String compareContent, int i19, kotlin.jvm.internal.i iVar) {
        lVar = (i19 & 2) != 0 ? null : lVar;
        rVar = (i19 & 4) != 0 ? null : rVar;
        i17 = (i19 & 8) != 0 ? 0 : i17;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        compareContent = (i19 & 32) != 0 ? "" : compareContent;
        kotlin.jvm.internal.o.g(chatroomMember, "chatroomMember");
        kotlin.jvm.internal.o.g(compareContent, "compareContent");
        this.f428142a = chatroomMember;
        this.f428143b = lVar;
        this.f428144c = rVar;
        this.f428145d = i17;
        this.f428146e = i18;
        this.f428147f = compareContent;
    }

    @Override // si5.c
    public int a() {
        return this.f428146e;
    }

    @Override // si5.c
    public int b(ri5.j thisItem, ri5.j otherItem, si5.c other) {
        kotlin.jvm.internal.o.g(thisItem, "thisItem");
        kotlin.jvm.internal.o.g(otherItem, "otherItem");
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof ui5.b)) {
            return 0;
        }
        int i17 = thisItem.f396110e;
        int i18 = kotlin.jvm.internal.o.i(i17, otherItem.f396110e);
        if (i18 != 0) {
            return i18;
        }
        ri5.h hVar = ri5.j.I;
        if (i17 == ri5.j.W) {
            return kotlin.jvm.internal.o.i(this.f428145d, ((ui5.b) other).f428145d);
        }
        ui5.b bVar = (ui5.b) other;
        int i19 = kotlin.jvm.internal.o.i(this.f428146e, bVar.f428146e);
        return i19 != 0 ? i19 : this.f428147f.compareTo(bVar.f428147f);
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
        if (!(other instanceof ui5.b)) {
            return false;
        }
        ui5.b bVar = (ui5.b) other;
        return kotlin.jvm.internal.o.b(this.f428142a, bVar.f428142a) && kotlin.jvm.internal.o.b(this.f428143b, bVar.f428143b) && kotlin.jvm.internal.o.b(this.f428144c, bVar.f428144c) && this.f428145d == bVar.f428145d && this.f428146e == bVar.f428146e && kotlin.jvm.internal.o.b(this.f428147f, bVar.f428147f);
    }
}

package so2;

/* loaded from: classes.dex */
public final class c2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yw2 f410292d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f410293e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.SpannableString f410294f;

    /* renamed from: g, reason: collision with root package name */
    public final int f410295g;

    public c2(r45.yw2 divider) {
        kotlin.jvm.internal.o.g(divider, "divider");
        this.f410292d = divider;
        this.f410293e = jz5.h.b(new so2.b2(this));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = divider.getString(1);
        ((ke0.e) xVar).getClass();
        this.f410294f = com.tencent.mm.pluginsdk.ui.span.c0.i(context, string);
        this.f410295g = divider.getInteger(2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof so2.c2)) {
            return -1;
        }
        r45.yw2 yw2Var = ((so2.c2) obj).f410292d;
        long j17 = yw2Var.getLong(3);
        r45.yw2 yw2Var2 = this.f410292d;
        return (j17 == yw2Var2.getLong(3) && yw2Var.getInteger(2) == yw2Var2.getInteger(2) && kotlin.jvm.internal.o.b(yw2Var.getString(1), yw2Var2.getString(1))) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return ((java.lang.Number) ((jz5.n) this.f410293e).getValue()).longValue();
    }

    @Override // in5.c
    public int h() {
        return com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION;
    }

    public java.lang.String toString() {
        return "ItemId=" + getItemId() + ",ItemType=2011 tipStyle=" + this.f410295g + " tip=" + ((java.lang.Object) this.f410294f);
    }
}

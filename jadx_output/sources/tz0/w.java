package tz0;

/* loaded from: classes12.dex */
public final class w implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f423254a;

    public w(java.util.List list) {
        this.f423254a = list;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f423254a.add(new jz5.o(item, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        return false;
    }
}

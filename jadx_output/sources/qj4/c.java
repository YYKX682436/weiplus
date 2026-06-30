package qj4;

/* loaded from: classes11.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f363907d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "source_scene"), com.tencent.mm.protobuf.i.u(-1, "source_self_status")});
        this.f363907d = appendAttrs;
        super.set__serialName("EnterSceneInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, ""});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        return false;
    }

    public void j(int i17) {
        super.set(this.f363907d + 0, java.lang.Integer.valueOf(i17));
    }

    public void k(java.lang.String str) {
        super.set(this.f363907d + 1, str);
    }
}

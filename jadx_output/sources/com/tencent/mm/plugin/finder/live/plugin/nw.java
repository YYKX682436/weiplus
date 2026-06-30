package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f113681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f113682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(com.tencent.mm.plugin.finder.live.plugin.ow owVar, java.util.List list) {
        super(0);
        this.f113681d = owVar;
        this.f113682e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String headUrl;
        java.util.List list;
        com.tencent.mm.plugin.finder.live.plugin.ow.t1(this.f113681d);
        java.util.List<r45.ch1> list2 = this.f113682e;
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f113681d;
        synchronized (list2) {
            for (r45.ch1 ch1Var : list2) {
                r45.xn1 xn1Var = (r45.xn1) ch1Var.getCustom(13);
                if (xn1Var != null) {
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                    if (finderContact != null && (headUrl = finderContact.getHeadUrl()) != null) {
                        r45.ri1 ri1Var = new r45.ri1();
                        com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                        java.lang.String str = null;
                        if (byteString != null) {
                            try {
                                ri1Var.fromProtobuf(byteString.g());
                                str = ri1Var.getString(0);
                                java.lang.String str2 = owVar.f113787p;
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e(owVar.f113787p, "tryEmitHightLightLikeByOthers：parseFrom failed: " + e17.getMessage(), e17);
                            }
                        }
                        if (str == null || str.length() == 0) {
                            owVar.Q.add(headUrl);
                        } else {
                            dk2.ga gaVar = (dk2.ga) ((java.util.LinkedHashMap) owVar.f113798x0).get(str);
                            if (gaVar != null && (list = gaVar.f233520h) != null) {
                                list.add(headUrl);
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.wechat.aff.emoticon;

/* loaded from: classes15.dex */
class ZIDL__QyxtUAHB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.emoticon.f f216633a;

    public void ZIDL_A(byte[] bArr, int i17, int i18) {
        com.tencent.wechat.aff.emoticon.f fVar = this.f216633a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.tencent.mm.feature.emoji.q2) fVar).getClass();
        if (((com.tencent.wechat.aff.emoticon.s) com.tencent.wechat.aff.emoticon.v.f216675c.a().f216677a.get(java.lang.Integer.valueOf(r26.q0.a(str)))) != null) {
            r26.q0.a(str);
        }
    }

    public void ZIDL_B(byte[] bArr) {
        com.tencent.wechat.aff.emoticon.f fVar = this.f216633a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.tencent.mm.feature.emoji.q2) fVar).getClass();
        com.tencent.wechat.aff.emoticon.s sVar = (com.tencent.wechat.aff.emoticon.s) com.tencent.wechat.aff.emoticon.v.f216675c.a().f216677a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (sVar != null) {
            r26.q0.a(str);
            synchronized (sVar) {
                java.util.Iterator it = ((java.util.ArrayList) sVar.f216672j).iterator();
                while (it.hasNext()) {
                    ((yz5.l) it.next()).invoke(com.tencent.wechat.aff.emoticon.o.f216657d);
                }
                ((java.util.ArrayList) sVar.f216672j).clear();
            }
        }
    }

    public void ZIDL_C(byte[] bArr) {
        com.tencent.wechat.aff.emoticon.f fVar = this.f216633a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.tencent.mm.feature.emoji.q2) fVar).getClass();
        com.tencent.wechat.aff.emoticon.s sVar = (com.tencent.wechat.aff.emoticon.s) com.tencent.wechat.aff.emoticon.v.f216675c.a().f216677a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (sVar != null) {
            r26.q0.a(str);
            synchronized (sVar) {
                java.util.Iterator it = ((java.util.ArrayList) sVar.f216672j).iterator();
                while (it.hasNext()) {
                    ((yz5.l) it.next()).invoke(com.tencent.wechat.aff.emoticon.o.f216658e);
                }
                ((java.util.ArrayList) sVar.f216672j).clear();
            }
        }
    }

    public void ZIDL_D(byte[] bArr, int i17, boolean z17) {
        com.tencent.wechat.aff.emoticon.f fVar = this.f216633a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        bw5.ia iaVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : bw5.ia.EmoticonDesignerListDataType_IPSet : bw5.ia.EmoticonDesignerListDataType_SingleEmoji : bw5.ia.EmoticonDesignerListDataType_StorePack;
        ((com.tencent.mm.feature.emoji.q2) fVar).getClass();
        com.tencent.wechat.aff.emoticon.s sVar = (com.tencent.wechat.aff.emoticon.s) com.tencent.wechat.aff.emoticon.v.f216675c.a().f216677a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (sVar != null) {
            sVar.f216671i.put(iaVar, java.lang.Boolean.valueOf(z17));
            int i18 = iaVar == null ? -1 : com.tencent.wechat.aff.emoticon.p.f216660a[iaVar.ordinal()];
            if (i18 != -1) {
                if (i18 == 1) {
                    java.util.ArrayList arrayList = sVar.f216665c;
                    int size = arrayList.size();
                    java.util.ArrayList arrayList2 = sVar.f216668f;
                    arrayList2.clear();
                    com.tencent.wechat.aff.emoticon.w wVar = com.tencent.wechat.aff.emoticon.w.f216679b;
                    java.util.ArrayList c17 = wVar.c(sVar.f216663a);
                    kotlin.jvm.internal.o.f(c17, "getStorePackList(...)");
                    arrayList2.addAll(kz5.n0.R(c17, size));
                    arrayList.clear();
                    arrayList.addAll(wVar.c(sVar.f216663a));
                } else if (i18 == 2) {
                    java.util.ArrayList arrayList3 = sVar.f216666d;
                    int size2 = arrayList3.size();
                    java.util.ArrayList arrayList4 = sVar.f216669g;
                    arrayList4.clear();
                    com.tencent.wechat.aff.emoticon.w wVar2 = com.tencent.wechat.aff.emoticon.w.f216679b;
                    java.util.ArrayList a17 = wVar2.a(sVar.f216663a);
                    kotlin.jvm.internal.o.f(a17, "getEmojiInfoList(...)");
                    arrayList4.addAll(kz5.n0.R(a17, size2));
                    arrayList3.clear();
                    arrayList3.addAll(wVar2.a(sVar.f216663a));
                } else {
                    if (i18 != 3) {
                        throw new jz5.j();
                    }
                    java.util.ArrayList arrayList5 = sVar.f216667e;
                    int size3 = arrayList5.size();
                    java.util.ArrayList arrayList6 = sVar.f216670h;
                    arrayList6.clear();
                    com.tencent.wechat.aff.emoticon.w wVar3 = com.tencent.wechat.aff.emoticon.w.f216679b;
                    java.util.ArrayList b17 = wVar3.b(sVar.f216663a);
                    kotlin.jvm.internal.o.f(b17, "getIpSetList(...)");
                    arrayList6.addAll(kz5.n0.R(b17, size3));
                    arrayList5.clear();
                    arrayList5.addAll(wVar3.b(sVar.f216663a));
                }
            }
            yz5.l lVar = sVar.f216673k;
            if (lVar != null) {
                lVar.invoke(com.tencent.wechat.aff.emoticon.o.f216657d);
            }
            sVar.f216673k = null;
        }
    }

    public void ZIDL_E(byte[] bArr, int i17) {
        com.tencent.wechat.aff.emoticon.f fVar = this.f216633a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.tencent.mm.feature.emoji.q2) fVar).getClass();
        com.tencent.wechat.aff.emoticon.s sVar = (com.tencent.wechat.aff.emoticon.s) com.tencent.wechat.aff.emoticon.v.f216675c.a().f216677a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (sVar != null) {
            yz5.l lVar = sVar.f216673k;
            if (lVar != null) {
                lVar.invoke(com.tencent.wechat.aff.emoticon.o.f216658e);
            }
            sVar.f216673k = null;
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f216633a = (com.tencent.wechat.aff.emoticon.f) obj;
    }
}

package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class z implements com.tencent.mm.plugin.facedetect.model.u {
    public z(com.tencent.mm.plugin.flash.d0 d0Var) {
    }

    @Override // com.tencent.mm.plugin.facedetect.model.u
    public void a(byte[] bArr) {
        com.tencent.mm.plugin.facedetect.model.s sVar = com.tencent.mm.plugin.facedetect.model.s.f100033d;
        synchronized (sVar) {
            sVar.k(bArr);
        }
    }

    @Override // com.tencent.mm.plugin.facedetect.model.u
    public com.tencent.mm.memory.a b() {
        return com.tencent.mm.plugin.facedetect.model.s.f100033d;
    }
}

package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class v1 extends com.tencent.mm.plugin.game.model.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final m53.e2 f140494a;

    public v1(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null) {
            this.f140494a = new m53.e2();
        } else {
            this.f140494a = (m53.e2) fVar;
        }
    }

    public v1(byte[] bArr) {
        m53.e2 e2Var = new m53.e2();
        this.f140494a = e2Var;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            e2Var.parseFrom(bArr);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GamePBDataDownloadGuidance", "Parsing Failed: %s", e17.getMessage());
        }
    }
}

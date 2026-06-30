package ps2;

/* loaded from: classes10.dex */
public class e implements bi4.r0 {
    @Override // bi4.r0
    public al5.a0 A1(java.lang.String str, android.widget.FrameLayout container, pj4.j0 jumpInfo, pj4.t pullDownParam) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(pullDownParam, "pullDownParam");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        com.tencent.mars.xlog.Log.i("Finder.TextStatusProvider", "createPullDownView() called with: sourceId = " + str + ", container = " + container + ", jumpInfo = " + jumpInfo + ", pullDownParam = " + pullDownParam + " busiBuf.isNullOrNil::" + com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo.f355141f));
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo.f355141f)) {
            finderObject = b(android.util.Base64.decode(jumpInfo.f355142g, 0));
        } else {
            finderObject.parseFrom(android.util.Base64.decode(jumpInfo.f355141f, 0));
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject2.getObjectDesc();
        if (objectDesc != null && objectDesc.getMediaType() == 2) {
            z17 = true;
        }
        return z17 ? new com.tencent.mm.plugin.finder.view.dm(str, container, jumpInfo, pullDownParam, finderObject2) : new com.tencent.mm.plugin.finder.view.km(str, container, jumpInfo, pullDownParam, finderObject2);
    }

    public com.tencent.mm.protocal.protobuf.FinderObject b(byte[] bArr) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        if (bArr != null) {
            pj4.s1 s1Var = new pj4.s1();
            s1Var.parseFrom(bArr);
            finderObject.setId(s1Var.f355286d);
            finderObject.setObjectNonceId(s1Var.f355287e);
        }
        return finderObject;
    }

    @Override // bi4.r0
    public void release() {
    }

    @Override // bi4.r0
    public bi4.o0 w7(java.lang.String str) {
        return new ps2.d(str, "Finder.TextStatusProvider");
    }
}

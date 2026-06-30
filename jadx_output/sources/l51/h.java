package l51;

/* loaded from: classes12.dex */
public class h implements com.tencent.mm.mm7zip.IOutCreateCallback, l51.a {

    /* renamed from: c, reason: collision with root package name */
    public static int f316568c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f316569d = -1;

    /* renamed from: a, reason: collision with root package name */
    public final l51.d[] f316570a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f316571b;

    public h(l51.d[] dVarArr, java.lang.String str) {
        this.f316570a = dVarArr;
        this.f316571b = str;
        int length = dVarArr.length / 4;
        f316569d = length;
        if (length < 4) {
            f316569d = 4;
        }
    }

    public void a() {
        l51.d[] dVarArr = this.f316570a;
        for (int i17 = 0; i17 < dVarArr.length; i17++) {
            try {
                l51.d dVar = dVarArr[i17];
                if (dVar != null) {
                    try {
                        l51.b bVar = dVar.f316560b;
                        if (bVar != null) {
                            bVar.getClass();
                            dVarArr[i17].f316560b = null;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.stubs.logger.Log.i("Zip7MMMergeCallBack", "Zip7DiffCallBack, remove byteArrayStream = " + e17);
                    }
                    try {
                        h51.h hVar = dVarArr[i17].f316561c;
                        if (hVar != null) {
                            hVar.close();
                            dVarArr[i17].f316561c = null;
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.stubs.logger.Log.i("Zip7MMMergeCallBack", "Zip7DiffCallBack, remove byteArrayStream = " + e18);
                    }
                    dVarArr[i17].getClass();
                    dVarArr[i17] = null;
                }
            } catch (java.lang.Exception e19) {
                com.tencent.stubs.logger.Log.i("Zip7MMMergeCallBack", "Zip7DiffCallBack, destory destory = " + e19);
                return;
            }
        }
        java.lang.Runtime.getRuntime().gc();
    }

    public void b(int i17, java.lang.String str) {
        l51.d[] dVarArr = this.f316570a;
        com.tencent.stubs.logger.Log.i("Zip7MMMergeCallBack", "clearData = " + i17);
        try {
            l51.d dVar = dVarArr[i17];
            if (dVar.f316560b != null) {
                dVar.f316560b = null;
            }
            dVar.getClass();
            dVarArr[i17] = null;
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.i("Zip7MMMergeCallBack", "Zip7DiffCallBack, clearData byteArrayStream = " + e17);
        }
        int i18 = f316568c + 1;
        f316568c = i18;
        int i19 = f316569d;
        if (i19 <= 0 || i18 % i19 != 0) {
            return;
        }
        com.tencent.stubs.logger.Log.i("Zip7MMMergeCallBack", "finishTask, finistask = " + f316568c + ", filePath = " + str + ", MAX_GC_TIME = " + f316569d);
        java.lang.Runtime.getRuntime().gc();
        com.tencent.stubs.logger.Log.i("Zip7MMMergeCallBack", "finishTask, finistask = " + f316568c + ", filePath = " + str + ", MAX_GC_TIME = " + f316569d);
    }

    @Override // com.tencent.mm.mm7zip.IOutCreateCallback
    public com.tencent.mm.mm7zip.IOutItemBase getItemInformation(int i17, com.tencent.mm.mm7zip.impl.OutItemFactory outItemFactory) {
        com.tencent.mm.mm7zip.IOutItemBase createOutItem = outItemFactory.createOutItem();
        l51.d[] dVarArr = this.f316570a;
        createOutItem.setDataSize(java.lang.Long.valueOf(dVarArr[i17].f316562d.f279035e));
        ((com.tencent.mm.mm7zip.IOutItemZip) createOutItem).setPropertyPath(dVarArr[i17].f316559a);
        return createOutItem;
    }

    @Override // com.tencent.mm.mm7zip.IOutCreateCallback
    public com.tencent.mm.mm7zip.ISequentialInStream getStream(int i17) {
        h51.h hVar;
        h51.h hVar2;
        l51.d[] dVarArr = this.f316570a;
        h51.h hVar3 = null;
        try {
            hVar2 = new h51.h(new java.io.File(this.f316571b));
        } catch (java.lang.Exception unused) {
        }
        try {
            dVarArr[i17].f316561c = hVar2;
            hVar = hVar2;
        } catch (java.lang.Exception unused2) {
            hVar3 = hVar2;
            hVar = hVar3;
            l51.d dVar = dVarArr[i17];
            java.lang.String str = this.f316571b;
            h51.j jVar = dVar.f316562d;
            dVar.f316560b = new l51.b(str, (int) jVar.f279034d, (int) jVar.f279035e, hVar, this, i17);
            l51.d dVar2 = dVarArr[i17];
            l51.b bVar = dVar2.f316560b;
            bVar.f316553o = dVar2.f316559a;
            return bVar;
        }
        l51.d dVar3 = dVarArr[i17];
        java.lang.String str2 = this.f316571b;
        h51.j jVar2 = dVar3.f316562d;
        dVar3.f316560b = new l51.b(str2, (int) jVar2.f279034d, (int) jVar2.f279035e, hVar, this, i17);
        l51.d dVar22 = dVarArr[i17];
        l51.b bVar2 = dVar22.f316560b;
        bVar2.f316553o = dVar22.f316559a;
        return bVar2;
    }

    @Override // com.tencent.mm.mm7zip.IProgress
    public void setCompleted(long j17) {
    }

    @Override // com.tencent.mm.mm7zip.IOutCreateCallback
    public void setOperationResult(boolean z17) {
    }

    @Override // com.tencent.mm.mm7zip.IProgress
    public void setTotal(long j17) {
    }
}

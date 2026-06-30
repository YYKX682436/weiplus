package h7;

/* loaded from: classes13.dex */
public class h extends f7.b {
    public h(h7.f fVar) {
        super(fVar);
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return h7.f.class;
    }

    @Override // w6.z0
    public int getSize() {
        h7.m mVar = ((h7.f) this.f260024d).f279333d.f279332a;
        s6.f fVar = (s6.f) mVar.f279349a;
        return fVar.f403296d.limit() + fVar.f403301i.length + (fVar.f403302j.length * 4) + mVar.f279362n;
    }

    @Override // f7.b, w6.u0
    public void initialize() {
        ((h7.f) this.f260024d).f279333d.f279332a.f279360l.prepareToDraw();
    }

    @Override // w6.z0
    public void recycle() {
        x6.b bVar;
        x6.b bVar2;
        x6.b bVar3;
        h7.f fVar = (h7.f) this.f260024d;
        fVar.stop();
        fVar.f279336g = true;
        h7.m mVar = fVar.f279333d.f279332a;
        ((java.util.ArrayList) mVar.f279351c).clear();
        android.graphics.Bitmap bitmap = mVar.f279360l;
        if (bitmap != null) {
            mVar.f279353e.b(bitmap);
            mVar.f279360l = null;
        }
        mVar.f279354f = false;
        h7.j jVar = mVar.f279357i;
        com.bumptech.glide.r rVar = mVar.f279352d;
        if (jVar != null) {
            rVar.i(jVar);
            mVar.f279357i = null;
        }
        h7.j jVar2 = mVar.f279359k;
        if (jVar2 != null) {
            rVar.i(jVar2);
            mVar.f279359k = null;
        }
        h7.j jVar3 = mVar.f279361m;
        if (jVar3 != null) {
            rVar.i(jVar3);
            mVar.f279361m = null;
        }
        s6.f fVar2 = (s6.f) mVar.f279349a;
        fVar2.f403304l = null;
        byte[] bArr = fVar2.f403301i;
        s6.a aVar = fVar2.f403295c;
        if (bArr != null && (bVar3 = ((h7.d) aVar).f279331b) != null) {
            ((x6.l) bVar3).g(bArr);
        }
        int[] iArr = fVar2.f403302j;
        if (iArr != null && (bVar2 = ((h7.d) aVar).f279331b) != null) {
            ((x6.l) bVar2).g(iArr);
        }
        android.graphics.Bitmap bitmap2 = fVar2.f403305m;
        if (bitmap2 != null) {
            ((h7.d) aVar).f279330a.b(bitmap2);
        }
        fVar2.f403305m = null;
        fVar2.f403296d = null;
        fVar2.f403311s = null;
        byte[] bArr2 = fVar2.f403297e;
        if (bArr2 != null && (bVar = ((h7.d) aVar).f279331b) != null) {
            ((x6.l) bVar).g(bArr2);
        }
        mVar.f279358j = true;
    }
}

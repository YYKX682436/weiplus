package yi;

/* loaded from: classes15.dex */
public class k extends yi.h {

    /* renamed from: b, reason: collision with root package name */
    public final int f462471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f462472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi.l f462473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yi.l lVar, int i17, int i18, long j17) {
        super(null);
        this.f462473d = lVar;
        this.f462471b = i17;
        this.f462472c = i18;
    }

    @Override // yi.h
    public void a() {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462474b.write(this.f462471b);
            aj.a.i(lVar.f462474b, this.f462472c);
            aj.a.i(lVar.f462474b, lVar.f462476d.size());
            lVar.f462474b.write(lVar.f462476d.toByteArray());
            lVar.f462476d.reset();
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void b(int i17, zi.b bVar) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(i17);
            lVar.f462476d.write(bVar.f473076a);
            if (i17 == 1) {
                aj.a.h(lVar.f462476d, lVar.f462475c);
            }
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void c(zi.b bVar, int i17, zi.b bVar2, zi.b bVar3, int i18, zi.a[] aVarArr, zi.a[] aVarArr2) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(32);
            java.io.ByteArrayOutputStream byteArrayOutputStream = lVar.f462476d;
            byteArrayOutputStream.write(bVar.f473076a);
            aj.a.i(byteArrayOutputStream, i17);
            byteArrayOutputStream.write(bVar2.f473076a);
            byteArrayOutputStream.write(bVar3.f473076a);
            aj.a.h(byteArrayOutputStream, lVar.f462475c << 2);
            aj.a.i(byteArrayOutputStream, i18);
            aj.a.k(byteArrayOutputStream, 0);
            aj.a.k(byteArrayOutputStream, aVarArr.length);
            for (zi.a aVar : aVarArr) {
                byteArrayOutputStream.write(aVar.f473074b.f473076a);
                byteArrayOutputStream.write(aVar.f473073a);
                aj.a.l(byteArrayOutputStream, aVar.f473075c);
            }
            aj.a.k(byteArrayOutputStream, aVarArr2.length);
            for (zi.a aVar2 : aVarArr2) {
                byteArrayOutputStream.write(aVar2.f473074b.f473076a);
                byteArrayOutputStream.write(aVar2.f473073a);
            }
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void d(int i17, zi.b bVar) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(254);
            aj.a.i(lVar.f462476d, i17);
            lVar.f462476d.write(bVar.f473076a);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void e(zi.b bVar, int i17, zi.b bVar2, byte[] bArr) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(33);
            lVar.f462476d.write(bVar.f473076a);
            aj.a.i(lVar.f462476d, i17);
            lVar.f462476d.write(bVar2.f473076a);
            aj.a.i(lVar.f462476d, bArr.length);
            lVar.f462476d.write(bArr);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void f(zi.b bVar, int i17, int i18) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(3);
            lVar.f462476d.write(bVar.f473076a);
            aj.a.i(lVar.f462476d, i17);
            aj.a.i(lVar.f462476d, i18);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void g(zi.b bVar, int i17, int i18) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(2);
            lVar.f462476d.write(bVar.f473076a);
            aj.a.i(lVar.f462476d, i17);
            aj.a.i(lVar.f462476d, i18);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void h(zi.b bVar, int i17, int i18) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
            lVar.f462476d.write(bVar.f473076a);
            aj.a.i(lVar.f462476d, i17);
            aj.a.i(lVar.f462476d, i18);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void i(zi.b bVar, int i17) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(4);
            lVar.f462476d.write(bVar.f473076a);
            aj.a.i(lVar.f462476d, i17);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void j(zi.b bVar, int i17, int i18, zi.b bVar2, byte[] bArr) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(34);
            lVar.f462476d.write(bVar.f473076a);
            aj.a.i(lVar.f462476d, i17);
            aj.a.i(lVar.f462476d, i18);
            lVar.f462476d.write(bVar2.f473076a);
            lVar.f462476d.write(bArr, 0, i18 * lVar.f462475c);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void k(int i17, zi.b bVar, int i18, int i19, int i27, byte[] bArr) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(i17);
            lVar.f462476d.write(bVar.f473076a);
            aj.a.i(lVar.f462476d, i18);
            aj.a.i(lVar.f462476d, i19);
            lVar.f462476d.write(i27);
            zi.c a17 = zi.c.a(i27);
            int i28 = lVar.f462475c;
            int i29 = a17.f473080e;
            if (i29 != 0) {
                i28 = i29;
            }
            lVar.f462476d.write(bArr, 0, i19 * i28);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void l(zi.b bVar, int i17) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(6);
            lVar.f462476d.write(bVar.f473076a);
            aj.a.i(lVar.f462476d, i17);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void m(zi.b bVar, int i17, int i18) {
        yi.l lVar = this.f462473d;
        try {
            lVar.f462476d.write(8);
            lVar.f462476d.write(bVar.f473076a);
            aj.a.i(lVar.f462476d, i17);
            aj.a.i(lVar.f462476d, i18);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }
}

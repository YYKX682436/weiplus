package nl;

/* loaded from: classes13.dex */
public class h extends nl.e {

    /* renamed from: i, reason: collision with root package name */
    public float f338155i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f338156j = true;

    @Override // nl.e
    public byte[] b(int i17, int i18, int i19) {
        this.f338156j = true;
        for (int i27 = 0; i27 < i18; i27++) {
            int i28 = 0;
            for (int i29 = 0; i29 < i17; i29++) {
                i28 += this.f338147a[i29][i27];
            }
            int d17 = d(i28, this.f338156j);
            if (i27 == i18 / 2) {
                this.f338156j = true;
            }
            this.f338150d[i27] = c(d17);
        }
        return a(i19, i18);
    }

    public final int d(int i17, boolean z17) {
        float f17 = this.f338155i;
        float f18 = i17;
        int i18 = (int) (f17 * f18);
        int i19 = this.f338152f;
        if (i18 > i19) {
            float f19 = i19 / f18;
            this.f338155i = f19;
            if (f19 < 1.0f) {
                this.f338155i = f19 - ((1.0f - f19) / 16.0f);
            }
            return d(i18, false);
        }
        int i27 = this.f338153g;
        if (i18 < i27) {
            float f27 = i27 / f18;
            this.f338155i = f27;
            if (f27 < 1.0f) {
                this.f338155i = f27 - ((1.0f - f27) / 16.0f);
            }
            return d(i18, false);
        }
        if (z17 && i17 < i19 && i17 > i27) {
            if (f17 < 1.0f) {
                this.f338155i = f17 + ((1.0f - f17) / 16.0f);
            } else {
                this.f338155i = 1.0f;
            }
            this.f338156j = false;
        }
        return i18;
    }
}

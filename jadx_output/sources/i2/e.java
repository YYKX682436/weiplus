package i2;

/* loaded from: classes14.dex */
public final class e implements a2.o {

    /* renamed from: a, reason: collision with root package name */
    public final a2.o1 f287854a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.g f287855b;

    /* renamed from: c, reason: collision with root package name */
    public final i2.f f287856c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f287857d;

    /* renamed from: e, reason: collision with root package name */
    public final b2.g f287858e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f287859f;

    /* renamed from: g, reason: collision with root package name */
    public final int f287860g;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r8 == 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b4, code lost:
    
        if ((p2.t.c(r7) == 0.0f) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x023c, code lost:
    
        if (p2.u.c(r6.f795c) == false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0615 A[LOOP:2: B:194:0x0613->B:195:0x0615, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x062e A[LOOP:3: B:198:0x062c->B:199:0x062e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e2  */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.text.SpannableString, android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.String r44, a2.o1 r45, java.util.List r46, java.util.List r47, f2.g r48, p2.f r49) {
        /*
            Method dump skipped, instructions count: 1672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.e.<init>(java.lang.String, a2.o1, java.util.List, java.util.List, f2.g, p2.f):void");
    }

    @Override // a2.o
    public boolean a() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f287859f;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            i2.i iVar = (i2.i) arrayList.get(i17);
            if (iVar.f287866a.getValue() != iVar.f287867b) {
                return true;
            }
        }
        return false;
    }

    @Override // a2.o
    public float b() {
        return ((java.lang.Number) this.f287858e.f17288b.getValue()).floatValue();
    }

    @Override // a2.o
    public float c() {
        return ((java.lang.Number) this.f287858e.f17289c.getValue()).floatValue();
    }
}

package s20;

/* loaded from: classes9.dex */
public final class f extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f402279d;

    /* renamed from: e, reason: collision with root package name */
    public final bw5.c9 f402280e;

    /* renamed from: f, reason: collision with root package name */
    public final int f402281f;

    public f(android.content.Context context, bw5.c9 item, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        this.f402279d = context;
        this.f402280e = item;
        this.f402281f = i17;
    }

    public final void a(android.text.TextPaint textPaint) {
        int i17 = this.f402281f;
        if (i17 <= 0) {
            return;
        }
        android.content.Context context = this.f402279d;
        float b17 = i65.a.b(context, i17);
        int i18 = this.f402280e.f25977g;
        if (i18 <= 0) {
            i18 = 14;
        }
        float b18 = i65.a.b(context, i18);
        if (b17 > b18) {
            textPaint.baselineShift = 0 - ((int) ((b17 - b18) + 0.5f));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(1:3)|4|(6:6|(1:8)(1:75)|(1:74)(1:12)|(3:69|70|(1:16))|14|(0))(6:76|(1:78)(1:93)|(1:92)(1:82)|(3:87|88|(1:86))|84|(0))|17|(9:(9:(9:(9:22|(1:24)(2:45|(1:47)(2:48|(2:50|(2:52|(2:54|(1:56)(2:57|(2:59|(1:61)(2:62|(1:64)))))))))|25|(1:27)(1:(1:43)(1:44))|28|29|(1:31)|32|(2:34|35)(1:37))|65|25|(0)(0)|28|29|(0)|32|(0)(0))|66|25|(0)(0)|28|29|(0)|32|(0)(0))|67|25|(0)(0)|28|29|(0)|32|(0)(0))|68|25|(0)(0)|28|29|(0)|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0108, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveShoppingPriceView", "setTypeface() Exception:" + r1.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.text.TextPaint r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s20.f.b(android.text.TextPaint):void");
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        b(textPaint);
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        b(textPaint);
        a(textPaint);
    }
}

package i33;

/* loaded from: classes10.dex */
public final class r1 extends i33.d implements i33.n1 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f288241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288241d = jz5.h.b(new i33.q1(this));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x004d. Please report as an issue. */
    public java.lang.String T6(android.content.Context context, int i17, int i18, int i19, java.lang.String str, boolean z17, java.util.ArrayList arrayList) {
        boolean n17 = j33.d0.n();
        if (i17 != 4) {
            if (i17 != 11) {
                if (i17 != 19 && i17 != 22) {
                    if (i17 != 39) {
                        if (i17 != 43) {
                            if (i17 != 45) {
                                if (i17 == 48) {
                                    return getString(com.tencent.mm.R.string.f490441v5);
                                }
                                if (i17 != 7) {
                                    if (i17 != 8) {
                                        if (i17 != 28) {
                                            if (i17 != 29) {
                                                if (i17 != 33) {
                                                    if (i17 != 34 && i17 != 36) {
                                                        if (i17 != 37) {
                                                            switch (i17) {
                                                                case 13:
                                                                case 14:
                                                                    break;
                                                                default:
                                                                    switch (i17) {
                                                                        case 24:
                                                                            break;
                                                                        case 25:
                                                                        case 26:
                                                                            break;
                                                                        default:
                                                                            if (i18 == 0 || i19 <= 1) {
                                                                                return getString(com.tencent.mm.R.string.f490551ya);
                                                                            }
                                                                            java.lang.String string = z17 ? getContext().getString(com.tencent.mm.R.string.fis, java.lang.Integer.valueOf(i18)) : getContext().getString(com.tencent.mm.R.string.fiu, java.lang.Integer.valueOf(i18));
                                                                            kotlin.jvm.internal.o.d(string);
                                                                            return string;
                                                                    }
                                                                case 15:
                                                                case 16:
                                                                    if ((com.tencent.mm.sdk.platformtools.t8.K0(str) && kotlin.jvm.internal.o.b(str, "album_business_bubble_media_by_coordinate")) || t23.p0.k().f415297f == 25) {
                                                                        if (i18 == 0 || i19 <= 1) {
                                                                            return getString(com.tencent.mm.R.string.f490502ww);
                                                                        }
                                                                        return getString(com.tencent.mm.R.string.f490502ww) + '(' + i18 + ")";
                                                                    }
                                                                    if (i18 != 0 || i19 <= 1) {
                                                                        return getString(com.tencent.mm.R.string.f492184fj2);
                                                                    }
                                                                    return getString(com.tencent.mm.R.string.f492184fj2) + '(' + i18 + ")";
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return getString(com.tencent.mm.R.string.f490502ww);
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        }
                        if (i18 != 0) {
                        }
                        return getString(com.tencent.mm.R.string.f492184fj2);
                    }
                    return getString(com.tencent.mm.R.string.f492184fj2);
                }
            }
            return getString(com.tencent.mm.R.string.f491117c02);
        }
        if (n17 && j33.d0.j(arrayList, true)) {
            return getString(com.tencent.mm.R.string.f492185fj3) + '(' + i18 + ")";
        }
        if (i18 == 0 || i19 <= 1) {
            return getString(com.tencent.mm.R.string.f492184fj2);
        }
        return getString(com.tencent.mm.R.string.f492184fj2) + '(' + i18 + ")";
    }

    @Override // i33.n1
    public android.widget.TextView Y2() {
        android.widget.Button button = (android.widget.Button) ((jz5.n) this.f288241d).getValue();
        kotlin.jvm.internal.o.f(button, "<get-btnConfirm>(...)");
        return button;
    }
}

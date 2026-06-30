package com.tencent.mm.wallet_core;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f213797a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f213798b;

    static {
        int[] iArr = new int[com.tencent.kinda.gen.StatesType.values().length];
        f213798b = iArr;
        try {
            iArr[com.tencent.kinda.gen.StatesType.CHECKED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f213798b[com.tencent.kinda.gen.StatesType.UNCHECKED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[com.tencent.kinda.gen.TraitsType.values().length];
        f213797a = iArr2;
        try {
            iArr2[com.tencent.kinda.gen.TraitsType.BUTTON.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f213797a[com.tencent.kinda.gen.TraitsType.CHECKBOX.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}

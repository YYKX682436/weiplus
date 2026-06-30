package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class d4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f208327f;

    public d4(android.content.Context context, java.lang.String str, int i17) {
        this.f208325d = context;
        this.f208326e = str;
        this.f208327f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.h4.c(this.f208325d, this.f208326e, this.f208327f);
    }
}

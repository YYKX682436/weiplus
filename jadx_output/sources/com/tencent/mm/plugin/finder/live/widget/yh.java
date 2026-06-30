package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ei f120447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(com.tencent.mm.plugin.finder.live.widget.ei eiVar) {
        super(0);
        this.f120447d = eiVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.text.Editable text;
        com.tencent.mm.plugin.finder.live.widget.ei eiVar = this.f120447d;
        android.widget.EditText editText = eiVar.f118256o;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        eiVar.setFansClubName(str);
        java.lang.String fansClubName = eiVar.getFansClubName();
        boolean z17 = false;
        if (!(fansClubName == null || fansClubName.length() == 0) && !kotlin.jvm.internal.o.b(eiVar.getFansClubName(), eiVar.getLastFansClubName())) {
            z17 = true;
        }
        eiVar.d(z17);
        return jz5.f0.f302826a;
    }
}

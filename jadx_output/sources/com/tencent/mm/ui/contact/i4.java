package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class i4 implements vg3.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.j4 f206779a;

    public i4(com.tencent.mm.ui.contact.j4 j4Var) {
        this.f206779a = j4Var;
    }

    @Override // vg3.j3
    public void a(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", str2);
            intent.putExtra("key_has_create_new_group", 1);
            com.tencent.mm.ui.contact.j4 j4Var = this.f206779a;
            j4Var.f206957d.setResult(-1, intent);
            j4Var.f206957d.finish();
        }
    }
}

package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class d3 extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(vx3.i desc, java.lang.String username) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(username, "username");
        wx3.a.c(4L, pm0.v.u(desc.f441298o), 2, username, false, false, 48, null);
    }

    public final void P6(vx3.i desc, java.lang.String str, boolean z17) {
        int i17;
        java.lang.String valueOf;
        kotlin.jvm.internal.o.g(desc, "desc");
        long j17 = desc.f441298o;
        if (j17 != 0) {
            i17 = 2;
        } else if (desc.f441300q == 0) {
            return;
        } else {
            i17 = 1;
        }
        if (i17 == 1) {
            valueOf = java.lang.String.valueOf(desc.f441300q);
        } else if (i17 != 2) {
            return;
        } else {
            valueOf = pm0.v.u(j17);
        }
        wx3.a.b(2L, valueOf, i17, str, desc.f441297n, z17);
    }

    public final void Q6(vx3.i desc, java.lang.String str, boolean z17) {
        java.lang.String str2;
        int i17;
        kotlin.jvm.internal.o.g(desc, "desc");
        int i18 = desc.f441300q;
        if (i18 != 0) {
            str2 = java.lang.String.valueOf(i18);
            i17 = 1;
        } else {
            long j17 = desc.f441298o;
            if (j17 != 0) {
                str2 = pm0.v.u(j17);
                i17 = 2;
            } else {
                str2 = "0";
                i17 = 3;
            }
        }
        wx3.a.c(1L, str2, i17, str, false, z17, 16, null);
    }

    public final void R6(vx3.i iVar, java.lang.String str, boolean z17) {
        int i17;
        java.lang.String valueOf;
        if (iVar == null) {
            return;
        }
        long j17 = iVar.f441298o;
        if (j17 != 0) {
            i17 = 2;
        } else if (iVar.f441300q == 0) {
            return;
        } else {
            i17 = 1;
        }
        if (i17 == 1) {
            valueOf = java.lang.String.valueOf(iVar.f441300q);
        } else if (i17 != 2) {
            return;
        } else {
            valueOf = pm0.v.u(j17);
        }
        wx3.a.b(3L, valueOf, i17, str, iVar.f441297n, z17);
    }
}

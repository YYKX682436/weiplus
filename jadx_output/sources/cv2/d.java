package cv2;

/* loaded from: classes10.dex */
public final class d extends uh4.c {
    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(com.tencent.mm.R.string.f8e);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        aVar.f427965i.setVisibility(8);
        rt0.e eVar = (rt0.e) aVar.f427957a.y(rt0.e.class);
        boolean equals = c01.z1.r().equals(aVar.f427962f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFill, state:");
        sb6.append(state);
        sb6.append(", type:");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f399379d) : null);
        sb6.append(", isWard:");
        sb6.append(equals);
        com.tencent.mars.xlog.Log.i("FinderLimitAuthorizationFiller", sb6.toString());
        if (eVar != null) {
            int i17 = eVar.f399379d;
            hy2.g gVar = hy2.g.f286058a;
            if (i17 == 5) {
                if (equals) {
                    int c17 = gVar.c() / 60;
                    android.content.Context context2 = aVar.f427963g.getContext();
                    int ordinal = state.ordinal();
                    if (ordinal == 0) {
                        aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f492104f74, java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(c17)));
                        return;
                    }
                    if (ordinal == 1) {
                        aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f76));
                        return;
                    } else if (ordinal == 2) {
                        aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f492101f71, java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(c17)));
                        return;
                    } else {
                        if (ordinal != 3) {
                            return;
                        }
                        aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f492100f70, java.lang.Integer.valueOf(c17)));
                        return;
                    }
                }
                int c18 = gVar.c() / 60;
                android.content.Context context3 = aVar.f427963g.getContext();
                int ordinal2 = state.ordinal();
                if (ordinal2 == 0) {
                    aVar.f427963g.setText(context3.getResources().getString(com.tencent.mm.R.string.f77));
                    aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f492103f73, java.lang.Integer.valueOf(c18), java.lang.Integer.valueOf(c18)));
                    return;
                } else if (ordinal2 == 1) {
                    aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f76));
                    return;
                } else if (ordinal2 == 2) {
                    aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f492105f75, java.lang.Integer.valueOf(c18)));
                    return;
                } else {
                    if (ordinal2 != 3) {
                        return;
                    }
                    aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f6z, java.lang.Integer.valueOf(c18)));
                    return;
                }
            }
            if (i17 != 6) {
                return;
            }
            if (equals) {
                int c19 = gVar.c() / 60;
                java.lang.String str = gVar.b() + ":00";
                java.lang.String str2 = "0" + gVar.a() + ":00";
                android.content.Context context4 = aVar.f427963g.getContext();
                int ordinal3 = state.ordinal();
                if (ordinal3 == 0) {
                    aVar.f427964h.setText(context4.getResources().getString(com.tencent.mm.R.string.f6y, str, str2, java.lang.Integer.valueOf(c19)));
                    return;
                }
                if (ordinal3 == 1) {
                    aVar.f427964h.setText(context4.getResources().getString(com.tencent.mm.R.string.f76));
                    return;
                } else if (ordinal3 == 2) {
                    aVar.f427964h.setText(context4.getResources().getString(com.tencent.mm.R.string.f6v, str, str2, str, java.lang.Integer.valueOf(c19)));
                    return;
                } else {
                    if (ordinal3 != 3) {
                        return;
                    }
                    aVar.f427964h.setText(context4.getResources().getString(com.tencent.mm.R.string.f6u, java.lang.Integer.valueOf(c19)));
                    return;
                }
            }
            int c27 = gVar.c() / 60;
            java.lang.String str3 = gVar.b() + ":00";
            java.lang.String str4 = "0" + gVar.a() + ":00";
            android.content.Context context5 = aVar.f427963g.getContext();
            int ordinal4 = state.ordinal();
            if (ordinal4 == 0) {
                aVar.f427963g.setText(context5.getResources().getString(com.tencent.mm.R.string.f77));
                aVar.f427964h.setText(context5.getResources().getString(com.tencent.mm.R.string.f6x, str3, str4, java.lang.Integer.valueOf(c27)));
            } else if (ordinal4 == 1) {
                aVar.f427964h.setText(context5.getResources().getString(com.tencent.mm.R.string.f76));
            } else if (ordinal4 == 2) {
                aVar.f427964h.setText(context5.getResources().getString(com.tencent.mm.R.string.f492105f75, java.lang.Integer.valueOf(c27)));
            } else {
                if (ordinal4 != 3) {
                    return;
                }
                aVar.f427964h.setText(context5.getResources().getString(com.tencent.mm.R.string.f6t, str3, java.lang.Integer.valueOf(c27)));
            }
        }
    }
}

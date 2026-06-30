package kq3;

/* loaded from: classes12.dex */
public class g implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        double[] c17;
        if (com.tencent.mars.xlog.Log.getLogLevel() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        char c18 = 65535;
        switch (str2.hashCode()) {
            case -1796087539:
                if (str2.equals("printrate")) {
                    c18 = 0;
                    break;
                }
                break;
            case -1424659792:
                if (str2.equals("enabledebug")) {
                    c18 = 1;
                    break;
                }
                break;
            case -1354714445:
                if (str2.equals("copydb")) {
                    c18 = 2;
                    break;
                }
                break;
            case 66125101:
                if (str2.equals("outlimit")) {
                    c18 = 3;
                    break;
                }
                break;
            case 819712873:
                if (str2.equals("deletedb")) {
                    c18 = 4;
                    break;
                }
                break;
        }
        try {
            switch (c18) {
                case 0:
                    if (strArr.length > 2 && com.tencent.mm.storage.z3.R4(str)) {
                        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar.requireAccountInitialized();
                        double[] c19 = nVar.f265532q.c(str, strArr[2]);
                        java.lang.String str3 = strArr[2];
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String str4 = strArr[2];
                        ((sg3.a) v0Var).getClass();
                        java.lang.String format = java.lang.String.format("%s\n%s\n DayClickRate: %.2f\nWeekClickRate: %.2f\nMonthClickRate: %.2f", str3, c01.a2.e(str4), java.lang.Double.valueOf(c19[0]), java.lang.Double.valueOf(c19[1]), java.lang.Double.valueOf(c19[2]));
                        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityCommand", "printrate %s", format);
                        b(context, format);
                        break;
                    } else {
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                        if (com.tencent.mm.storage.z3.R4(str)) {
                            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar2.requireAccountInitialized();
                            c17 = nVar2.f265532q.c(str, "@all");
                            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar3.requireAccountInitialized();
                            com.tencent.mm.plugin.priority.model.c2c.img.f fVar = nVar3.f265532q;
                            fVar.getClass();
                            android.database.Cursor h17 = fVar.f320456a.h(java.lang.String.format("SELECT *, max(monthreceivecount) FROM %s WHERE chat = ? AND talker <> '%s' GROUP BY chat, talker;", "C2CMsgImgUsage", "@all"), new java.lang.String[]{str});
                            java.util.ArrayList arrayList = new java.util.ArrayList(10);
                            while (h17.moveToNext()) {
                                arrayList.add(fVar.b(h17));
                            }
                            h17.close();
                            java.util.Collections.sort(arrayList, new lq3.a(fVar));
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                r45.rr5 rr5Var = (r45.rr5) it.next();
                                stringBuffer.append("\n");
                                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                                java.lang.String str5 = rr5Var.f385143e;
                                ((sg3.a) v0Var2).getClass();
                                stringBuffer.append(c01.a2.e(str5));
                                stringBuffer.append("[");
                                stringBuffer.append(rr5Var.f385143e);
                                stringBuffer.append("][");
                                stringBuffer.append(k35.m1.d("yyyy-MM-dd", rr5Var.f385144f / 1000));
                                stringBuffer.append("]");
                                stringBuffer.append(java.lang.String.format("%.2f %.2f %.2f %d", java.lang.Float.valueOf(rr5Var.f385151p), java.lang.Float.valueOf(rr5Var.f385152q), java.lang.Float.valueOf(rr5Var.f385153r), java.lang.Integer.valueOf(rr5Var.f385149n)));
                            }
                        } else {
                            fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar4.requireAccountInitialized();
                            c17 = nVar4.f265532q.c(str, str);
                        }
                        java.lang.String format2 = java.lang.String.format("DayClickRate: %.2f\nWeekClickRate: %.2f\nMonthClickRate: %.2f%s", java.lang.Double.valueOf(c17[0]), java.lang.Double.valueOf(c17[1]), java.lang.Double.valueOf(c17[2]), stringBuffer.toString());
                        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityCommand", "printrate %s", format2);
                        b(context, format2);
                        break;
                    }
                    break;
                case 1:
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityCommand", "enabledebug %s", strArr[2]);
                    strArr[2].equals("1");
                    break;
                case 2:
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityCommand", "copydb");
                    gm0.j1.i();
                    java.lang.String o17 = new com.tencent.mm.vfs.r6(gm0.j1.u().h(), "MicroMsgPriority.db").o();
                    com.tencent.mm.vfs.w6.h("/sdcard/tencent/MicroMsg/Download/priority.db");
                    com.tencent.mm.vfs.w6.c(o17, "/sdcard/tencent/MicroMsg/Download/priority.db");
                    break;
                case 3:
                    long longValue = java.lang.Long.valueOf(strArr[2]).longValue();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityCommand", "currentCount %d", java.lang.Long.valueOf(longValue));
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG, java.lang.Long.valueOf(longValue));
                    break;
                case 4:
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityCommand", "deletedb");
                    gm0.j1.i();
                    com.tencent.mm.vfs.w6.h(new com.tencent.mm.vfs.r6(gm0.j1.u().h(), "MicroMsgPriority.db").o());
                    int myPid = android.os.Process.myPid();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(myPid));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/priority/model/PriorityCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/plugin/priority/model/PriorityCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    break;
            }
        } catch (java.lang.Exception unused) {
        }
        return true;
    }

    public final void b(android.content.Context context, java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(str);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(context, null, textView, null);
    }
}

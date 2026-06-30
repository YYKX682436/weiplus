package ni3;

/* loaded from: classes10.dex */
public final class t extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337735d;

    public t(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337735d = finderStreamMonitorView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.f337735d.f149459h;
        if (dataBuffer != null) {
            return dataBuffer.getTotalSize();
        }
        kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        throw null;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.f337735d.f149459h;
        if (dataBuffer == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            throw null;
        }
        so2.j5 j5Var = (so2.j5) kz5.n0.a0(dataBuffer, i17);
        if (j5Var != null) {
            return j5Var.getItemId();
        }
        return 0L;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int i18;
        java.lang.CharSequence charSequence;
        int i19;
        int i27;
        java.lang.String str;
        long j17;
        java.lang.String str2;
        java.lang.String str3;
        long j18;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView;
        so2.j5 j5Var;
        long j19;
        ni3.q qVar;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView2;
        java.lang.String sb6;
        android.widget.TextView textView;
        java.lang.CharSequence charSequence2;
        int i28;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView3;
        int i29;
        boolean z17;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String concat;
        ni3.r rVar;
        java.lang.String str8;
        java.lang.String concat2;
        ni3.r rVar2;
        java.lang.String str9;
        ni3.r rVar3;
        ni3.r rVar4;
        r45.vf2 vf2Var;
        r45.vf2 vf2Var2;
        ni3.u holder = (ni3.u) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView4 = this.f337735d;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = finderStreamMonitorView4.f149459h;
        if (dataBuffer == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            throw null;
        }
        so2.j5 j5Var2 = (so2.j5) kz5.n0.a0(dataBuffer, i17);
        android.widget.TextView textView2 = holder.f337742d;
        if (j5Var2 == null) {
            textView2.setText(com.eclipsesource.mmv8.Platform.UNKNOWN);
            return;
        }
        java.lang.String u17 = pm0.v.u(j5Var2.getItemId());
        java.lang.String obj = u17.subSequence(java.lang.Math.max(0, u17.length() - 4), u17.length()).toString();
        r45.mb4 c17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView4, j5Var2);
        java.lang.String string = c17.getString(9);
        if (string == null || string.length() == 0) {
            textView2.setText("unknown feedType(" + j5Var2.h() + ')');
            return;
        }
        textView2.setOnLongClickListener(new ni3.s(holder, finderStreamMonitorView4));
        java.lang.String string2 = c17.getString(9);
        if (string2 == null) {
            string2 = "";
        }
        ni3.q qVar2 = (ni3.q) finderStreamMonitorView4.f149466r.get(string2);
        if (finderStreamMonitorView4.f149458g) {
            j5Var2.getItemId();
            java.lang.String string3 = c17.getString(9);
            if (string3 != null) {
                java.lang.String string4 = c17.getString(9);
                int length = string4 != null ? string4.length() : 0;
                charSequence2 = string3.subSequence(0, 5 > length ? length : 5);
            } else {
                charSequence2 = null;
            }
            java.lang.String valueOf = java.lang.String.valueOf(charSequence2);
            int integer = c17.getInteger(2);
            int i37 = qVar2 != null ? qVar2.f337687b : 0;
            if (qVar2 != null) {
                i28 = qVar2.f337688c;
                if (i28 == 0) {
                    i28 = qVar2.f337687b;
                }
            } else {
                i28 = 0;
            }
            java.lang.Math.max(i37, i28);
            java.lang.String str10 = qVar2 != null ? qVar2.f337690e : null;
            long itemId = j5Var2.getItemId();
            java.lang.String b17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.b(finderStreamMonitorView4, j5Var2);
            if (j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                z17 = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().isLongVideo();
                finderStreamMonitorView3 = finderStreamMonitorView4;
                i29 = 3;
            } else {
                finderStreamMonitorView3 = finderStreamMonitorView4;
                i29 = 3;
                z17 = false;
            }
            int integer2 = c17.getInteger(i29);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (itemId != 0) {
                sb7.append("> ");
            }
            if (z17) {
                sb7.append(i17 + "-[长视频-#" + obj + "] ");
            } else if (integer == 4) {
                sb7.append(i17 + "-[视频-#" + obj + "] ");
            } else if (integer == 2) {
                sb7.append(i17 + "-[图片-#" + obj + "] ");
                if (qVar2 != null) {
                    qVar2.f337694i = ni3.r.f337704e;
                }
                if (qVar2 != null) {
                    qVar2.f337695j = ni3.r.f337710n;
                }
            } else if (integer == 9) {
                sb7.append(i17 + "-[直播-#" + obj + "] ");
                if (qVar2 != null) {
                    qVar2.f337694i = ni3.r.f337704e;
                }
                if (qVar2 != null) {
                    qVar2.f337695j = ni3.r.f337710n;
                }
            } else {
                sb7.append("[?-" + i17 + '#' + obj + "] ");
            }
            sb7.append(valueOf.concat(" "));
            if (str10 != null) {
                sb7.append(str10);
            }
            yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            jz5.o oVar = (jz5.o) ek6.f464701r.get(qVar2 != null ? qVar2.f337700o : null);
            int longValue = oVar != null ? (int) ((java.lang.Number) oVar.f302843f).longValue() : 0;
            java.lang.String str11 = qVar2 != null ? qVar2.f337700o : null;
            kk.l lVar = ek6.f464701r;
            jz5.o oVar2 = (jz5.o) lVar.get(str11);
            int integer3 = (oVar2 == null || (vf2Var2 = (r45.vf2) oVar2.f302841d) == null) ? 0 : vf2Var2.getInteger(2);
            jz5.o oVar3 = (jz5.o) lVar.get(qVar2 != null ? qVar2.f337700o : null);
            if (oVar3 != null && (vf2Var = (r45.vf2) oVar3.f302841d) != null) {
                vf2Var.getInteger(1);
            }
            sb7.append(" " + b17 + " PBitRate:" + integer3 + '/' + longValue + "Bps");
            if (qVar2 == null || (rVar4 = qVar2.f337694i) == ni3.r.f337704e || rVar4 == ni3.r.f337709m) {
                str6 = "未启动";
                if (qVar2 == null || (rVar = qVar2.f337694i) == null || (str7 = rVar.f337718d) == null) {
                    ni3.r rVar5 = ni3.r.f337704e;
                    str7 = str6;
                }
                concat = "下载器：".concat(str7);
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                str6 = "未启动";
                java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(integer2 * ((((float) qVar2.f337698m) * 1.0f) / ((float) qVar2.f337699n)))}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                sb8.append(format);
                sb8.append('/');
                sb8.append(integer2);
                sb8.append((char) 31186);
                java.lang.String sb9 = sb8.toString();
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder("下载器:");
                java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((((float) qVar2.f337698m) * 100.0f) / ((float) qVar2.f337699n))}, 1));
                kotlin.jvm.internal.o.f(format2, "format(...)");
                sb10.append(format2);
                sb10.append("%  ");
                sb10.append(com.tencent.mm.sdk.platformtools.t8.f0(qVar2.f337698m));
                sb10.append('/');
                sb10.append(com.tencent.mm.sdk.platformtools.t8.f0(qVar2.f337699n));
                sb10.append(' ');
                sb10.append(sb9);
                sb10.append(' ');
                sb10.append(qVar2.f337694i.f337718d);
                concat = sb10.toString();
            }
            if (qVar2 == null || (rVar3 = qVar2.f337695j) == ni3.r.f337710n || rVar3 == ni3.r.f337716t || rVar3 == ni3.r.f337711o || rVar3 == ni3.r.f337712p) {
                if (qVar2 == null || (rVar2 = qVar2.f337695j) == null || (str9 = rVar2.f337718d) == null) {
                    ni3.r rVar6 = ni3.r.f337704e;
                    str8 = str6;
                } else {
                    str8 = str9;
                }
                concat2 = "播放器：".concat(str8);
            } else {
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder("播放器: ");
                java.lang.String format3 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((qVar2.f337696k * 100.0f) / ((float) qVar2.f337697l))}, 1));
                kotlin.jvm.internal.o.f(format3, "format(...)");
                sb11.append(format3);
                sb11.append("%  ");
                sb11.append(qVar2.f337696k);
                sb11.append('/');
                sb11.append(qVar2.f337697l);
                sb11.append("秒 ");
                sb11.append(qVar2.f337695j.f337718d);
                concat2 = sb11.toString();
            }
            sb7.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append(concat);
            sb7.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append(concat2);
            java.lang.String sb12 = sb7.toString();
            kotlin.jvm.internal.o.f(sb12, "toString(...)");
            qVar = qVar2;
            j5Var = j5Var2;
            textView = textView2;
            sb6 = sb12;
            finderStreamMonitorView2 = finderStreamMonitorView3;
        } else {
            long itemId2 = j5Var2.getItemId();
            java.lang.String string5 = c17.getString(9);
            if (string5 != null) {
                java.lang.String string6 = c17.getString(9);
                int length2 = string6 != null ? string6.length() : 0;
                int i38 = 5 > length2 ? length2 : 5;
                i18 = 0;
                charSequence = string5.subSequence(0, i38);
            } else {
                i18 = 0;
                charSequence = null;
            }
            java.lang.String valueOf2 = java.lang.String.valueOf(charSequence);
            int integer4 = c17.getInteger(2);
            int i39 = qVar2 != null ? qVar2.f337687b : i18;
            if (qVar2 != null) {
                i19 = qVar2.f337688c;
                if (i19 == 0) {
                    i19 = qVar2.f337687b;
                }
            } else {
                i19 = 0;
            }
            int max = java.lang.Math.max(i39, i19);
            if (qVar2 != null) {
                i27 = qVar2.f337688c;
                if (i27 == 0) {
                    i27 = qVar2.f337687b;
                }
            } else {
                i27 = 0;
            }
            if (qVar2 != null) {
                str = "> ";
                j17 = qVar2.f337686a;
            } else {
                str = "> ";
                j17 = 0;
            }
            if (qVar2 != null) {
                str2 = "toString(...)";
                str3 = qVar2.f337690e;
            } else {
                str2 = "toString(...)";
                str3 = null;
            }
            if (qVar2 != null) {
                j18 = itemId2;
                str4 = qVar2.f337691f;
            } else {
                j18 = itemId2;
                str4 = null;
            }
            int i47 = qVar2 != null ? qVar2.f337692g : 0;
            long itemId3 = j5Var2.getItemId();
            int i48 = i47;
            long j27 = j17;
            java.lang.String b18 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.b(finderStreamMonitorView4, j5Var2);
            boolean isLongVideo = j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().isLongVideo() : false;
            if (qVar2 != null) {
                str5 = str4;
                finderStreamMonitorView = finderStreamMonitorView4;
                j19 = qVar2.f337693h;
                j5Var = j5Var2;
            } else {
                str5 = str4;
                finderStreamMonitorView = finderStreamMonitorView4;
                j5Var = j5Var2;
                j19 = 0;
            }
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            if (itemId3 != 0) {
                qVar = qVar2;
                sb13.append(str);
            } else {
                qVar = qVar2;
            }
            if (isLongVideo) {
                sb13.append("[LV-" + i17 + '#' + obj + "] ");
            } else if (integer4 == 4) {
                sb13.append("[V-" + i17 + '#' + obj + "] ");
            } else if (integer4 == 2) {
                sb13.append("[P-" + i17 + '#' + obj + "] ");
            } else if (integer4 == 9) {
                sb13.append("[L-" + i17 + '#' + obj + "] ");
            } else {
                sb13.append("[?-" + i17 + '#' + obj + "] ");
            }
            sb13.append(valueOf2.concat(" "));
            finderStreamMonitorView2 = finderStreamMonitorView;
            boolean z18 = finderStreamMonitorView2.f149457f;
            if (z18 && str3 != null) {
                sb13.append(str3);
            }
            if (!z18 && str5 != null) {
                sb13.append(" ".concat(str5));
            }
            if (integer4 == 4) {
                sb13.append(" " + max + "% (" + i27 + "%:" + com.tencent.mm.sdk.platformtools.t8.f0(j27) + ") ");
                if (j19 > 0) {
                    sb13.append("tc:" + j19);
                }
            } else {
                sb13.append("size=" + com.tencent.mm.sdk.platformtools.t8.f0(i48));
            }
            sb13.append(" ".concat(b18));
            if (finderStreamMonitorView2.f149465q.contains(java.lang.Long.valueOf(j18))) {
                sb13.append(" (preload)");
            }
            sb6 = sb13.toString();
            kotlin.jvm.internal.o.f(sb6, str2);
            textView = textView2;
        }
        textView.setText(sb6);
        int i49 = qVar != null ? qVar.f337689d : 0;
        if (finderStreamMonitorView2.f149461m == j5Var.getItemId()) {
            textView.setTextColor(finderStreamMonitorView2.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac));
            return;
        }
        if (i49 == 2) {
            textView.setTextColor(finderStreamMonitorView2.getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
        } else if (i49 == 3) {
            textView.setTextColor(finderStreamMonitorView2.getContext().getResources().getColor(com.tencent.mm.R.color.f478521a2));
        } else {
            textView.setTextColor(finderStreamMonitorView2.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup p07, int i17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        android.view.View inflate = android.view.LayoutInflater.from(p07.getContext()).inflate(com.tencent.mm.R.layout.cyg, p07, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ni3.u(inflate);
    }
}
